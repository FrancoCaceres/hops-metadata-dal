package io.hops.metadata.hdfs.entity;

import io.hops.metadata.common.FinderType;

import java.util.Objects;

public class S3ObjectChecksum {
  private long inodeId;
  private int objectIndex;
  private long checksum;

  public enum Finder implements FinderType<S3ObjectChecksum> {
    ByKeyTuple,
    ByInodeId;

    @Override
    public Class getType() {
      return S3ObjectChecksum.class;
    }

    @Override
    public Annotation getAnnotated() {
      switch (this) {
        case ByKeyTuple:
          return Annotation.PrimaryKey;
        case ByInodeId:
          return Annotation.PrunedIndexScan;
        default:
          throw new IllegalStateException();
      }
    }
  }

  public S3ObjectChecksum() {

  }

  public S3ObjectChecksum(long inodeId, int objectIndex, long checksum) {
    this.inodeId = inodeId;
    this.objectIndex = objectIndex;
    this.checksum = checksum;
  }

  public long getInodeId() {
    return inodeId;
  }

  public void setInodeId(long inodeId) {
    this.inodeId = inodeId;
  }

  public int getObjectIndex() {
    return objectIndex;
  }

  public void setObjectIndex(int objectIndex) {
    this.objectIndex = objectIndex;
  }

  public long getChecksum() {
    return checksum;
  }

  public void setChecksum(long checksum) {
    this.checksum = checksum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    S3ObjectChecksum that = (S3ObjectChecksum) o;
    return inodeId == that.inodeId &&
            objectIndex == that.objectIndex &&
            checksum == that.checksum;
  }

  @Override
  public int hashCode() {
    return Objects.hash(inodeId, objectIndex, checksum);
  }

  @Override
  public String toString() {
    return "S3ObjectChecksum{" +
            "inodeId=" + inodeId +
            ", objectIndex=" + objectIndex +
            ", checksum=" + checksum +
            '}';
  }
}
