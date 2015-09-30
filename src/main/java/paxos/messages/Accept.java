package paxos.messages;

import paxos.Member;

import java.io.Serializable;

public class Accept implements SpecialMessage {
    public long viewNo;
    public long seqNo;
    public Serializable message;
    public long msgId;
    public final Member sender;

    public Accept(long viewNo, long seqNo, Serializable message, long msgId, Member sender) {
        this.viewNo = viewNo;
        this.seqNo = seqNo;
        this.message = message;
        this.msgId = msgId;
        this.sender = sender;
    }

    public MessageType getMessageType() {
        return MessageType.ACCEPT;
    }

    @Override
    public String toString() {
        return "ACCEPT " + seqNo + " " + msgId;
    }
}