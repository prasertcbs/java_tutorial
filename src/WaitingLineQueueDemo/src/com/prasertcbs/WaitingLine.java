package com.prasertcbs;

import java.time.LocalDateTime;

/**
 * Created by prasert on 12/3/2014.
 */
public class WaitingLine {
    private static int seq = 0;
    private int queueId;
    private LocalDateTime inTime;

    public WaitingLine() {
        this.queueId = ++seq;
        this.inTime = LocalDateTime.now();
    }

    public int getQueueId() {
        return queueId;
    }

    public LocalDateTime getInTime() {
        return inTime;
    }

    @Override
    public String toString() {
        return "WaitingLine{" +
                "queueId=" + queueId +
                ", inTime=" + inTime +
                '}';
    }
}
