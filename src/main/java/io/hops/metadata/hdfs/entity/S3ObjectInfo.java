package io.hops.metadata.hdfs.entity;

public class S3ObjectInfo {
  private long objectId;
  private int objectIndex;
  private long inodeId;
  private String region;
  private String bucket;
  private String key;
  private String versionId;
  private long numBytes;
  private long checksum;

  public S3ObjectInfo(long objectId, int objectIndex, long inodeId, String region, String bucket, String key, String versionId, long numBytes, long checksum) {
    this.objectId = objectId;
    this.objectIndex = objectIndex;
    this.inodeId = inodeId;
    this.region = region;
    this.bucket = bucket;
    this.key = key;
    this.versionId = versionId;
    this.numBytes = numBytes;
    this.checksum = checksum;
  }

  public long getObjectId() {
    return objectId;
  }

  public void setObjectId(long objectId) {
    this.objectId = objectId;
  }

  public int getObjectIndex() {
    return objectIndex;
  }

  public void setObjectIndex(int objectIndex) {
    this.objectIndex = objectIndex;
  }

  public long getInodeId() {
    return inodeId;
  }

  public void setInodeId(long inodeId) {
    this.inodeId = inodeId;
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

  public long getChecksum() {
    return checksum;
  }

  public void setChecksum(long checksum) {
    this.checksum = checksum;
  }
}
