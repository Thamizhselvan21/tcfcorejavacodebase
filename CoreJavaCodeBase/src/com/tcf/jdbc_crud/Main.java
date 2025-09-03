package com.tcf.jdbc_crud;

public class Main {
	public static void main(String[] args) {
        JDBC_CRUD_Operations crud = new JDBC_CRUD_Operations();

        // CREATE a new record
        crud.create(1, "John");

        // READ all records
        crud.read();

        // UPDATE an existing record
        crud.update(1, "Johnny");

        // DELETE a record
        crud.delete(1);

        // READ again to see changes
        crud.read();
    }
}
