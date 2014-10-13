/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.com.boha.monitor.library.dto.transfer;

import com.com.boha.monitor.library.dto.CityDTO;
import com.com.boha.monitor.library.dto.CompanyDTO;
import com.com.boha.monitor.library.dto.CompanyStaffDTO;
import com.com.boha.monitor.library.dto.GcmDeviceDTO;
import com.com.boha.monitor.library.dto.ProjectDTO;
import com.com.boha.monitor.library.dto.ProjectDiaryRecordDTO;
import com.com.boha.monitor.library.dto.ProjectSiteDTO;
import com.com.boha.monitor.library.dto.ProjectSiteStaffDTO;
import com.com.boha.monitor.library.dto.ProjectSiteTaskDTO;
import com.com.boha.monitor.library.dto.ProjectSiteTaskStatusDTO;
import com.com.boha.monitor.library.dto.ProjectStatusTypeDTO;
import com.com.boha.monitor.library.dto.TownshipDTO;

import java.io.Serializable;

/**
 *
 * @author aubreyM
 */
public class RequestDTO implements Serializable{
    private Integer requestType, companyID, companyStaffID, projectID, 
            projectSiteID, loginType;
    private String email, pin, gcmRegistrationID;
    private CompanyDTO company;
    private CompanyStaffDTO companyStaff;
    private ProjectDTO project;
    private ProjectSiteDTO projectSite;
    private ProjectSiteStaffDTO projectSiteStaff;
    private GcmDeviceDTO gcmDevice;
    
    private ProjectSiteTaskDTO projectSiteTask;
    private ProjectDiaryRecordDTO projectDiaryRecord;
    private ProjectSiteTaskStatusDTO projectSiteTaskStatus;
    private ProjectStatusTypeDTO projectStatusType;
    private CityDTO city;
    private TownshipDTO township;
    //register actors
    public static final int
            REGISTER_COMPANY = 1,
            REGISTER_COMPANY_STAFF = 2,
            REGISTER_PROJECT = 3,
            REGISTER_PROJECT_SITE = 4,
            REGISTER_PROJECT_SITE_STAFF = 5;
    //add stuff
    public static final int
            ADD_PROJECT_SITE_TASK = 11,
            ADD_PROJECT_DIARY_RECORD = 12,
            ADD_PROJECT_SITE_TASK_STATUS = 13,
            ADD_PROJECT_STATUS_TYPE = 14,
            ADD_SITE_IMAGE = 15,
            ADD_TASK_IMAGE = 16,
            ADD_DEVICE = 17;
    //get stuff
    public static final int
            GET_PROJECT_DATA = 101,
            GET_PROJECT_SITE_DATA = 102,
            GET_SITE_IMAGE_FILENAMES = 103,
            GET_TASK_IMAGE_FILENAMES = 104,
            GET_COMPANY_STAFF = 105,
            GET_TASK_STATUS_LIST = 106,
            GET_COMPANY_STAFF_TYPE_LIST = 107,
            GET_COMPANY_DATA = 108,
            GET_COUNTRY_LIST = 109;
    //login's
    public static final int
            LOGIN = 200,
            SEND_GCM_REGISTRATION = 204;
    //lookups
    public static final int
            ADD_COMPANY_TASK = 301,
            ADD_COMPANY_TASK_STATUS = 302,
            ADD_COMPANY_PROJECT_STATUS_TYPE = 303,
            ADD_COMPANY_CHECKPOINT = 304,
            ADD_CITY = 305,
            ADD_TOWNSHIP = 306;


    public static final String COMPANY_DIR = "company";
    public static final String PROJECT_DIR = "project";
    public static final String PROJECT_SITE_DIR = "projectsite";
    public static final String TASK_DIR = "task";

    //

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public TownshipDTO getTownship() {
        return township;
    }

    public void setTownship(TownshipDTO township) {
        this.township = township;
    }

    public String getGcmRegistrationID() {
        return gcmRegistrationID;
    }

    public void setGcmRegistrationID(String gcmRegistrationID) {
        this.gcmRegistrationID = gcmRegistrationID;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    
    
    public Integer getRequestType() {
        return requestType;
    }

    public GcmDeviceDTO getGcmDevice() {
        return gcmDevice;
    }

    public void setGcmDevice(GcmDeviceDTO gcmDevice) {
        this.gcmDevice = gcmDevice;
    }

    
    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public Integer getCompanyStaffID() {
        return companyStaffID;
    }

    public void setCompanyStaffID(Integer companyStaffID) {
        this.companyStaffID = companyStaffID;
    }

    public Integer getProjectID() {
        return projectID;
    }

    public void setProjectID(Integer projectID) {
        this.projectID = projectID;
    }

    public Integer getProjectSiteID() {
        return projectSiteID;
    }

    public void setProjectSiteID(Integer projectSiteID) {
        this.projectSiteID = projectSiteID;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }

    public CompanyStaffDTO getCompanyStaff() {
        return companyStaff;
    }

    public void setCompanyStaff(CompanyStaffDTO companyStaff) {
        this.companyStaff = companyStaff;
    }

    public ProjectDTO getProject() {
        return project;
    }

    public void setProject(ProjectDTO project) {
        this.project = project;
    }

   

    public ProjectSiteDTO getProjectSite() {
        return projectSite;
    }

    public void setProjectSite(ProjectSiteDTO projectSite) {
        this.projectSite = projectSite;
    }

    public ProjectSiteStaffDTO getProjectSiteStaff() {
        return projectSiteStaff;
    }

    public void setProjectSiteStaff(ProjectSiteStaffDTO projectSiteStaff) {
        this.projectSiteStaff = projectSiteStaff;
    }

    public ProjectSiteTaskDTO getProjectSiteTask() {
        return projectSiteTask;
    }

    public void setProjectSiteTask(ProjectSiteTaskDTO projectSiteTask) {
        this.projectSiteTask = projectSiteTask;
    }

    public ProjectDiaryRecordDTO getProjectDiaryRecord() {
        return projectDiaryRecord;
    }

    public void setProjectDiaryRecord(ProjectDiaryRecordDTO projectDiaryRecord) {
        this.projectDiaryRecord = projectDiaryRecord;
    }

    public ProjectSiteTaskStatusDTO getProjectSiteTaskStatus() {
        return projectSiteTaskStatus;
    }

    public void setProjectSiteTaskStatus(ProjectSiteTaskStatusDTO projectSiteTaskStatus) {
        this.projectSiteTaskStatus = projectSiteTaskStatus;
    }

    public ProjectStatusTypeDTO getProjectStatusType() {
        return projectStatusType;
    }

    public void setProjectStatusType(ProjectStatusTypeDTO projectStatusType) {
        this.projectStatusType = projectStatusType;
    }
    
    
}
