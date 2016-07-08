/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.Downloadable;

import com.hrdb.Department;

/**
 * Service object for domain model class Department.
 *
 * @see {@link Department}
 */
public interface DepartmentService {

    /**
     * Creates a new Department.
     *
     * @param department The information of the created CompositeTable.
     * @return The created Department.
     */
	Department create(Department department);


	/**
	 * Finds Department by id.
	 *
	 * @param departmentId The id of the wanted Department.
	 * @return The found Department. If no Department is found, this method returns null.
	 */
	Department getById(Integer departmentId) throws EntityNotFoundException;

	/**
	 * Updates the information of a Department.
	 *
	 * @param department The information of the updated Department.
	 * @return The updated Department.
     *
	 * @throws EntityNotFoundException if no Department is found with given id.
	 */
	Department update(Department department) throws EntityNotFoundException;

    /**
	 * Deletes a Department.
	 *
	 * @param departmentId The id of the deleted Department.
	 * @return The deleted Department.
     *
	 * @throws EntityNotFoundException if no Department is found with the given id.
	 */
	Department delete(Integer departmentId) throws EntityNotFoundException;

	/**
	 * Finds all Departments.
	 *
	 * @return A list of Departments.
	 */
    @Deprecated
	Page<Department> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all Departments.
	 * @return A list of Departments.
	 */
    Page<Department> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Departments in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the Department.
	 */
	long count(String query);

    Page<Department> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

