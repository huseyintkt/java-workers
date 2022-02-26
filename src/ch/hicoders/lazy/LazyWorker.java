package ch.hicoders.lazy;

import ch.hicoders.worker.Worker;

public class LazyWorker implements Worker {
    private int costPerHour = 23;
    private int hoursPerWeek = 20;

    @Override
    public int calculatePrice() {
        return this.costPerHour * this.hoursPerWeek;
    }
}
