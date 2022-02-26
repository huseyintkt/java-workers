package ch.hicoders.good;

import ch.hicoders.worker.Worker;

public class GoodWorker implements Worker {
    private int costPerHour = 40;
    private int hoursPerWeek = 40;

    @Override
    public int calculatePrice() {
        return this.costPerHour * this.hoursPerWeek;
    }
}
