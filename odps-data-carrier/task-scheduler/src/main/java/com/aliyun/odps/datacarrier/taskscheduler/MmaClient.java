package com.aliyun.odps.datacarrier.taskscheduler;

public interface MmaClient {

  public void createMigrationJobs(MmaMigrationConfig mmaMigrationConfig);

  public MmaMetaManager.MigrationStatus getMigrationJobStatus(String db, String tbl);

  public MmaMetaManager.MigrationProgress getMigrationProgress(String db, String tbl);
}
