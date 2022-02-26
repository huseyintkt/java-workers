package ch.hicoders.utility;

import ch.hicoders.child.ChildWorker;
import ch.hicoders.disabled.DisabledWorker;
import ch.hicoders.good.GoodWorker;
import ch.hicoders.lazy.LazyWorker;
import ch.hicoders.worker.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utility {

    public static int getRandomNumber(int pMinValue, int pMaxValue){
        return new Random().nextInt(pMaxValue) + pMinValue;
    }

    public static List<Worker> generateRandomWorkers(int pCount){
        List<Worker> workerList = new ArrayList<Worker>();

        for (int index = 0; index < pCount; index++) {

            int randomNumberForWorkerType = Utility.getRandomNumber(0, 4);
            switch (randomNumberForWorkerType){
                case 0:
                    DisabledWorker disabledWorker = new DisabledWorker();
                    workerList.add(disabledWorker);
                    break;
                case 1:
                    LazyWorker lazyWorker = new LazyWorker();
                    workerList.add(lazyWorker);
                    break;
                case 2:
                    ChildWorker childWorker = new ChildWorker();
                    workerList.add(childWorker);
                    break;
                case 3:
                    GoodWorker goodWorker = new GoodWorker();
                    workerList.add(goodWorker);
                    break;
            }
        }

        return workerList;
    }

    public static int calculateTotalMoney(List<Worker> pWorkerList){
        int totalMoney = 0;

        for (int index = 0; index < pWorkerList.size(); index++) {
            totalMoney += pWorkerList.get(index).calculatePrice();
        }

        return totalMoney;
    }
}
