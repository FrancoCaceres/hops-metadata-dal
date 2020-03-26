package io.hops.metadata.hdfs.entity;

public class S3Processable {
  private long inodeId;
  private Long rescheduleAt;
  private String scheduledFor;

  public S3Processable(Long inodeId, Long rescheduleAt, String scheduledFor) {
    this.inodeId = inodeId;
    this.rescheduleAt = rescheduleAt;
    this.scheduledFor = scheduledFor;
  }

  public S3Processable(Long inodeId) {
    this.inodeId = inodeId;
    this.rescheduleAt = null;
    this.scheduledFor = null;
  }

  public long getInodeId() {
    return inodeId;
  }

  public void setInodeId(long inodeId) {
    this.inodeId = inodeId;
  }

  public Long getRescheduleAt() {
    return rescheduleAt;
  }

  public void setRescheduleAt(Long rescheduleAt) {
    this.rescheduleAt = rescheduleAt;
  }

  public String getScheduledFor() {
    return scheduledFor;
  }

  public void setScheduledFor(String scheduledFor) {
    this.scheduledFor = scheduledFor;
  }

  @Override
  public String toString() {
    return "S3Processable{" +
            "inodeId=" + inodeId +
            ", rescheduleAt=" + rescheduleAt +
            ", scheduledFor='" + scheduledFor + '\'' +
            '}';
  }
}
