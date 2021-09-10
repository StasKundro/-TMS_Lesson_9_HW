package com.tms.office.team;

import com.tms.office.Information;
import com.tms.office.exception.WorkException;

public interface IWorker {
    public void work(Information info) throws WorkException;
}
