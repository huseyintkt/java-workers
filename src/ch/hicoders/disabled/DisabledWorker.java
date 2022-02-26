package ch.hicoders.disabled;

import ch.hicoders.worker.Worker;

public class DisabledWorker implements Worker {
    private int costPerHour = 10;
    private int hoursPerWeek = 10;

    @Override
    public int calculatePrice() {
        return this.costPerHour * this.hoursPerWeek;
    }
}
