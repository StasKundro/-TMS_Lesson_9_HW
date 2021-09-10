package com.tms.office;

import com.tms.office.workInfo.WorkInfo;

public class Information {
    private WorkInfo workInfo;

    public Information(WorkInfo workInfo) {
        this.workInfo = workInfo;
    }

    public WorkInfo getWorkInfo() {
        return workInfo;
    }

    public void setWorkInfo(WorkInfo workInfo) {
        this.workInfo = workInfo;
    }
}
