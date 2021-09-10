package com.tms.office.team.accountant;

import com.tms.office.team.IWorker;
import com.tms.office.Information;
import com.tms.office.exception.WorkException;

public class Accountant  implements IWorker {

    @Override
    public void work(Information info) throws WorkException {
        System.out.println("Бухгалтер\nграфик работы : пон-суб 10:00-17:00");
    }
}
