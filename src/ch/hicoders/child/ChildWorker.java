package ch.hicoders.child;

import ch.hicoders.worker.Worker;

public class ChildWorker implements Worker {
    private int costPerHour = 10;
    private int hoursPerWeek = 30;

    @Override
    public int calculatePrice() {
        return this.costPerHour * this.hoursPerWeek;
    }
}
