package com.tms.office.team.worker;

import com.tms.office.team.IWorker;
import com.tms.office.Information;
import com.tms.office.exception.WorkException;

public class Worker implements IWorker {

    @Override
    public void work(Information info) throws WorkException {
        System.out.println("Рабочий\nграфик работы : пон-пят 9:00-18:00");
    }
}