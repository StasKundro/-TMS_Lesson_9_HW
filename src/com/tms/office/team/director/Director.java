package com.tms.office.team.director;

import com.tms.office.team.IWorker;
import com.tms.office.Information;
import com.tms.office.exception.WorkException;

public class Director implements IWorker {

    @Override
    public void work(Information info) throws WorkException {
        System.out.println("Директор\nграфик работы : пон-чет 9:00-17:00");
    }
}
