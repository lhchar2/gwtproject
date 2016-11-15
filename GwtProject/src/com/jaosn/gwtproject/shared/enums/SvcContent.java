package com.jaosn.gwtproject.shared.enums;

public enum SvcContent {
	// Customer Search
	CUST_SEARCH, CUST_SEARCH_RESULT, CUST_SEARCH_RESULT_MULTIPLE, CUST_SEARCH_HIST,
	HISTORY_SEARCH_RESULT,
	CUST_CONTACT_HISTORY,
	// Customer
	CUST_OVERVIEW, SERVICE_SUMMARY, CSL_SERVICE_SUMMARY,
	SB_ORDER_HISTORY, SB_ORDER_HISTORY2, CAMPAIGN,
	ADDRESS_PROFILE, PREPAID_SIM,
	//Follow Up
	CUST_FOLLOWUP,
	FOLLOW_UP_SEARCH,
	FOLLOW_UP_CREATE_LOG,
	FOLLOW_UP_CREATE_CASE,
	FOLLOW_UP_ADMIN,
	FOLLOW_UP_ADMIN_LIST,
	FOLLOW_UP_ADMIN_CENTRE_EDIT,
	// Call Log
	CALL_LOG_HISTORY, CALL_LOG_CREATION, CALL_LOG_READ, CALL_LOG_SEARCH,  
	CRM_CALL_LOG_HISTORY, BOM_CALL_LOG_HISTORY, CSL_CALL_LOG_HISTORY,
	CALL_NATURE_ADMIN, CALL_NATURE_IMPORT,
	// IMS
	IMS_CUST_PROFILE, IMS_ACCT_PROFILE, 
	IMS_SERVICE_PROFILE, 
	IMS_BROADBAND_PROFILE, IMS_TV_PROFILE, IMS_CONTRACT_HISTORY, IMS_OFFER_DETAILS, 
	IMS_USAGE,
	IMS_TV_VIEWERSHIP, IMS_TV_VIEWERSHIP_SPECIFIC,
	IMS_AM_ASM,
	IMS_UPPER_SERVICE_PROFILE, IMS_INSTALL_ACTIVATE_SERVICE_FEE,
	IMS_SERVICE_PROFILE_MESSAGE, IMS_SR_SUMMARY, 
	// LTS
	LTS_CUST_PROFILE, LTS_ACCT_PROFILE, 
	LTS_SERVICE_PROFILE, 
	LTS_PROFILE, LTS_EYE_INFO,LTS_OFFER_DETAILS,LTS_IDD_INFO,LTS_UPPER_SERVICE_PROFILE,
	LTS_USAGE,LTS_AMASM,LTS_CONTACT_HISTORY,LTS_DATA_PRIVACY,LTS_SERVICE_RELATED,
	LTS_ACCOUNT_SUMMARY,
	// MOB
	MOB_CUST_PROFILE, MOB_ACCT_PROFILE, 
	MOB_SERVICE_PROFILE, 
	MOB_CONTRACT_HISTORY, MOB_OFFER_DETAILS, MOB_NFC_INFO, MOB_OPT_OUT_INFO, MOB_TICKLER_CONTENT, 
	MOB_USAGE,
	MOB_AVERAGE_MONTHLY_SPENDING,MOB_HANDSET_REBATES,MOB_MONTHLY_USAGES,
	MOB_UPPER_SERVICE_PROFILE,
	MOB_TAB_AND_GO_SERVICE, MOB_TAB_AND_GO_KYC, 
	MOB_RESOURCE, MOB_PENALTY_FORECAST, MOB_DISCOUNT_REBATE_SCHEDULE,
	MOB_MKT_INFO,
	MOB_PAYMENT_METHOD_UPDATE, MOB_BILL_MEDIA_UPDATE,
	//CSL
	CSL_CUST_PROFILE, CSL_ACCT_PROFILE, CSL_SERVICE_PROFILE, CSL_TICKLER_NOTES,
	// SLV
	SLV_SERVICE_SUMMARY,
	CLUB_CAMPAIGN,
	// Prospect Customer
	PROSPECT_CUST, PROSPECT_CUST_INFO, PROSPECT_CUST_SEARCH,
	// D-Form
	DFORM_MANAGEMENT, DFORM_CUST, DFORM_NEW_REGISTER,
	// Hot of the day
	HOT_OF_THE_DAY_ADMIN,
	// Testing
	UPDATE_PROFILE, NETWORK_TEST,
	ACTION_FORM_DATA_SEARCH, ACTION_FORM_ADMIN,
	USER_ADMIN,
	// Email
	EMAIL_SEND_OUT,
	CREATE_NEW_EMAIL, PREVIEW_EMAIL, CREATE_EMAIL_TEMPLATE, EMAIL_TEMPLATE_MANAGER, EMAIL_SENT_HISTORY, 
	EMAIL_CATEGORY_ADMIN, EMAIL_CONTENT,EMAIL_CATEGORY_UPDATE,OPT_OUT_OPTION,
	// SMS
	CREATE_NEW_SMS, SMS_HISTORY, SMS_TEMP_ADMIN_MANAGER, SMS_BULK_UPLOAD, CREATE_NEW_SMS_TEMP_SEARCH, 
	// Fax
	FAX_DOC_SEARCH, FAX_CAT_EDIT, FAX_DOC_EDIT
	;

	public static SvcContent getFromString(String val) {
		if (val == null) return null;
		for (SvcContent svcContent : SvcContent.values()) {
			if (val.equals(svcContent.name())) {
				return svcContent;
			}
		}
		return null;
	}

}
