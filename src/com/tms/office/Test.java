package com.tms.office;

import com.tms.office.exception.WorkException;
import com.tms.office.team.IWorker;
import com.tms.office.team.accountant.Accountant;
import com.tms.office.team.director.Director;
import com.tms.office.team.worker.Worker;
import com.tms.office.workInfo.WorkInfo;

/**
 * Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
 * который печатает название должности и имплементировать этот метод в созданные классы.
 */

public class Test {

    public static void main(String[] args) {
        WorkInfo workInfo = new WorkInfo(3);
        Information info = new Information(workInfo);

        IWorker iWorker = getWorkerByCode(workInfo.getWorkInfoCode());
        try {
            iWorker.work(info);
        } catch (WorkException e) {
            e.printStackTrace();
        }
    }

    private static IWorker getWorkerByCode(int code) {
        IWorker iWorker;

        if (code == 1) {
            iWorker = new Director();
        } else if (code == 2) {
            iWorker = new Accountant();
        } else {
            iWorker = new Worker();
        }
        return iWorker;
    }

}
