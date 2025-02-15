package com.external.plugins.constants;

public class FieldName {

    // Common field paths
    public static final String BODY = "body.data";
    public static final String SMART_SUBSTITUTION = "smartSubstitution.data";
    public static final String COMMAND = "command.data";
    public static final String COLLECTION = "collection.data";

    // Command paths
    public static final String FIND = "find";
    public static final String UPDATE_MANY = "updateMany";
    public static final String DELETE = "delete";
    public static final String COUNT = "count";
    public static final String DISTINCT = "distinct";
    public static final String AGGREGATE = "aggregate";
    public static final String INSERT = "insert";

    // Command field paths
    public static final String QUERY = "query.data";
    public static final String SORT = "sort.data";
    public static final String PROJECTION = "projection.data";
    public static final String LIMIT = "limit.data";
    public static final String SKIP = "skip.data";
    public static final String UPDATE = "update.data";
    public static final String KEY = "key.data";
    public static final String PIPELINES = "arrayPipelines.data";
    public static final String DOCUMENTS = "documents.data";

    public static final String AGGREGATE_PIPELINES = AGGREGATE + "." + PIPELINES;
    public static final String AGGREGATE_LIMIT = AGGREGATE + "." + LIMIT;
    public static final String COUNT_QUERY = COUNT + "." + QUERY;
    public static final String DELETE_QUERY = DELETE + "." + QUERY;
    public static final String DELETE_LIMIT = DELETE + "." + LIMIT;
    public static final String DISTINCT_QUERY = DISTINCT + "." + QUERY;
    public static final String FIND_QUERY = FIND + "." + QUERY;
    public static final String FIND_SORT = FIND + "." + SORT;
    public static final String FIND_PROJECTION = FIND + "." + PROJECTION;
    public static final String INSERT_DOCUMENT = INSERT + "." + DOCUMENTS;
    public static final String UPDATE_QUERY = UPDATE_MANY + "." + QUERY;
    public static final String UPDATE_OPERATION = UPDATE_MANY + "." + UPDATE;
    public static final String DISTINCT_KEY = DISTINCT + "." + KEY;
    public static final String FIND_LIMIT = FIND + "." + LIMIT;
    public static final String FIND_SKIP = FIND + "." + SKIP;
    public static final String UPDATE_LIMIT = UPDATE_MANY + "." + LIMIT;

    
    public static final String RAW = "RAW";

}
