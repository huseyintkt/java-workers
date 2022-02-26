package ch.hicoders;

import ch.hicoders.child.ChildWorker;
import ch.hicoders.disabled.DisabledWorker;
import ch.hicoders.good.GoodWorker;
import ch.hicoders.lazy.LazyWorker;
import ch.hicoders.utility.Utility;
import ch.hicoders.worker.Worker;

import java.util.List;
import java.util.Random;

public class Application {

    public static void main(String[] args) {

        int randomNumberForWorkerCount = Utility.getRandomNumber(2,5);

        List<Worker> workerList = Utility.generateRandomWorkers(randomNumberForWorkerCount);

        int totalMoney = Utility.calculateTotalMoney(workerList);

        System.out.println("Total money payable to workers : " + totalMoney);
    }
}
