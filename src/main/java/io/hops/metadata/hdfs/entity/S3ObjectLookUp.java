package io.hops.metadata.hdfs.entity;

public class S3ObjectLookUp implements Comparable<S3ObjectLookUp> {
  private long objectId;
  private long inodeId;

  public S3ObjectLookUp(long objectId, long inodeId) {
    this.objectId = objectId;
    this.inodeId = inodeId;
  }

  public long getObjectId() {
    return objectId;
  }

  public long getInodeId() {
    return inodeId;
  }

  public void setObjectId(long objectId) {
    this.objectId = objectId;
  }

  public void setInodeId(long inodeId) {
    this.inodeId = inodeId;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final S3ObjectLookUp other = (S3ObjectLookUp) obj;
    if (this.objectId == other.objectId  && this.inodeId == other.inodeId) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 59 * hash + Long.hashCode(this.inodeId);
    hash = 59 * hash + (int) (this.objectId ^ (this.objectId >>> 32));
    return hash;
  }

  @Override
  public int compareTo(S3ObjectLookUp s3ObjectLookUp) {
    return 0;
  }
}
