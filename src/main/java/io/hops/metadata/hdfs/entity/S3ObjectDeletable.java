package io.hops.metadata.hdfs.entity;

public class S3ObjectDeletable {
  private Long id;
  private String region;
  private String bucket;
  private String key;
  private String versionId;
  private long numBytes;
  private Long rescheduleAt;
  private String scheduledFor;

  public S3ObjectDeletable(Long id, String region, String bucket, String key, String versionId, long numBytes,
                           Long rescheduleAt, String scheduledFor) {
    this.id = id;
    this.region = region;
    this.bucket = bucket;
    this.key = key;
    this.versionId = versionId;
    this.numBytes = numBytes;
    this.rescheduleAt = rescheduleAt;
    this.scheduledFor = scheduledFor;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public long getNumBytes() {
    return numBytes;
  }

  public void setNumBytes(long numBytes) {
    this.numBytes = numBytes;
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
    return String.format("[S3ObjectDeletable region=%s,bucket=%s,key=%s,versionId=%s]",
            bucket, region, key, versionId);
  }
}
