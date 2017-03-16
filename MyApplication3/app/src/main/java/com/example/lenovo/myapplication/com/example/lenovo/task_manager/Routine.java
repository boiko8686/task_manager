package com.example.lenovo.myapplication.com.example.lenovo.task_manager;
import org.joda.time.Period;

public class Routine extends Task{

	private int repeatDays;
	
	public Routine(boolean hasNotification, String name, String description, String time, String date, int repeatDays) {
		super(hasNotification, name, description, time, date);
		// TODO validation
		this.repeatDays = repeatDays;
		this.taskType = TaskType.Routine;
	}

	@Override
	protected void calcNextDate() {
		if(this.repeatDays >= 0){
			this.date = this.date.plus(Period.days(1));
			--this.repeatDays;
		}
	}

	@Override
	public String toString() {
		// TODO print info for task and days left to repeat
		return "Routine\nName: " + name + "\nDescription: " + description + "\nDays left: " + repeatDays;
	}
}
