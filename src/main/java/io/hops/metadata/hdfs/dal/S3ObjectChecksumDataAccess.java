package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.Objects;

public interface S3ObjectChecksumDataAccess<T> extends EntityDataAccess {
  public static class KeyTuple {
    private long inodeId;
    private int objectIndex;

    public KeyTuple(long inodeId, int objectIndex) {
      this.inodeId = inodeId;
      this.objectIndex = objectIndex;
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

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      KeyTuple keyTuple = (KeyTuple) o;
      return inodeId == keyTuple.inodeId &&
              objectIndex == keyTuple.objectIndex;
    }

    @Override
    public int hashCode() {
      return Objects.hash(inodeId, objectIndex);
    }

    @Override
    public String toString() {
      return "KeyTuple{" +
              "inodeId=" + inodeId +
              ", objectIndex=" + objectIndex +
              '}';
    }
  }

  void add(T objectChecksum) throws StorageException;

  void update(T objectChecksum) throws StorageException;

  void delete(T objectChecksum) throws StorageException;

  T find(long inodeId, int objectIndex) throws StorageException;

  Collection<T> findAll(long inodeId) throws StorageException;

  void deleteAll(long inodeId) throws StorageException;
}
