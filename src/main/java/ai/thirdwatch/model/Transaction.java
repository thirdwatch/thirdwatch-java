/*
 * Thirdwatch API
 * The first version of the Thirdwatch API is an exciting step forward towards making it easier for developers to pass data to Thirdwatch.  Once you've [registered your website/app](https://thirdwatch.ai) it's easy to start sending data to Thirdwatch.  All endpoints are only accessible via https and are located at `api.thirdwatch.ai`. For instance: you can send event at the moment by ```HTTP POST``` Request to the following URL with your API key in ```Header``` and ```JSON``` data in request body. ```   https://api.thirdwatch.ai/event/v1 ``` Every API request must contain ```API Key``` in header value ```X-THIRDWATCH-API-KEY```  Every event must contain your ```_userId``` (if this is not available, you can alternatively provide a ```_sessionId``` value also in ```_userId```).  JavaScript Fingerprinting module for capturing unique devices and tracking user interaction.  This script will identify unique devices with respect to the browser. For e.g., if chrome is opened in normal mode a unique device id is generated and this will be same if chrome is opened in incognito mode or reinstalled.  Paste the below script onto your webpage, just after the opening `<body>` tag. This script should be added to the page which is accessed externally by the user of your website. For e.g., If you want to track three different webpages then paste the below script onto each webpage, just after the opening `<body>` tag. This script should not be added onto internal tools or admin panels. ```   &lt;script id=\"thirdwatch\"     data-session-cookie-name=\"&lt;cookie_name&gt;\"     data-session-id-value=\"&lt;session_id&gt;\"     data-user-id=\"&lt;user_id&gt;\"     data-app-secret=\"&lt;app_secret&gt;\"     data-is-track-pageview=\"true\"&gt; (function() {         var loadDeviceJs = function() {         var element = document.createElement(\"script\");         element.async = 1;         element.src = \"https://cdn.thirdwatch.ai/tw.min.js\";         document.body.appendChild(element);         };         if (window.addEventListener) {              window.addEventListener(\"load\", loadDeviceJs, false);         } else if (window.attachEvent) {         window.attachEvent(\"onload\", loadDeviceJs);         }     })();   &lt;/script&gt; ``` * `data-session-cookie-name` -- The cookie name where you are saving the unique session id. We will pick the session id by reading its value from the cookie name. (Optional) * `data-session-id-value` -- In case you are not passing `data-session-cookie-name` than you can put session id directly in this parameter. In absence of both `data-session-cookie-name` and `data-session-id-value`, our system will generate a session Id. (Optional) * `data-user-id` -- Unique user id at your end. This can be email id or primary key in the database. In case of guest user, you can insert session Id here. * `data-app-secret` -- Unique App secret generated for you by Thirdwatch. * `data-is-track-pageview` -- If this is set to true, then the url on which this script is running will be sent to Thirdwatch, else the url will not be captured.   The Score API is use to get an up to date cutomer trust score after you have sent transaction event and order successful. This API will provide the riskiness score of the order with reasons. Some examples of when you may want to check the score are before:    - Before Shippement of a package   - Finalizing a money transfer   - Giving access to a prearranged vacation rental   - Sending voucher on mail  ```   https://api.thirdwatch.ai/neo/v1/score?api_key=<your api key>&order_id=<Order id> ```  According to Score you can decide to take action Approve or Reject. Orders with score more than 70 will consider as Riskey orders. We'll provide some reasons also in rules section.   ``` {   \"order_id\": \"OCT45671\",   \"user_id\": \"ajay_245\",   \"order_timestamp\": \"2017-05-09T09:40:45.717Z\",   \"score\": 82,   \"flag\": \"red\",     -\"reasons\": [     {         \"name\": \"_numOfFailedTransactions\",         \"display_name\": \"Number of failed transactions\",         \"flag\": \"green\",         \"value\": \"0\",         \"is_display\": true       },       {         \"name\": \"_accountAge\",         \"display_name\": \"Account age\",         \"flag\": \"red\",         \"value\": \"0\",         \"is_display\": true       },       {         \"name\": \"_numOfOrderSameIp\",         \"display_name\": \"Number of orders from same IP\",         \"flag\": \"red\",         \"value\": \"11\",         \"is_display\": true       }     ] } ``` 
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ai.thirdwatch.model;

import java.util.Objects;
import ai.thirdwatch.model.BillingAddress;
import ai.thirdwatch.model.CustomInfo;
import ai.thirdwatch.model.PaymentMethod;
import ai.thirdwatch.model.ShippingAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-21T16:23:00.366+05:30")
public class Transaction {
  @SerializedName("_userId")
  private String userId = null;

  @SerializedName("_sessionId")
  private String sessionId = null;

  @SerializedName("_orderId")
  private String orderId = null;

  @SerializedName("_transactionId")
  private String transactionId = null;

  @SerializedName("_deviceIp")
  private String deviceIp = null;

  @SerializedName("_originTimestamp")
  private String originTimestamp = null;

  @SerializedName("_userEmail")
  private String userEmail = null;

  @SerializedName("_amount")
  private String amount = null;

  @SerializedName("_currencyCode")
  private String currencyCode = null;

  @SerializedName("_transactionType")
  private String transactionType = null;

  @SerializedName("_transactionStatus")
  private String transactionStatus = null;

  @SerializedName("_isFirstTimeBuyer")
  private Boolean isFirstTimeBuyer = null;

  @SerializedName("_billingAddress")
  private BillingAddress billingAddress = null;

  @SerializedName("_shippingAddress")
  private ShippingAddress shippingAddress = null;

  @SerializedName("_paymentMethod")
  private PaymentMethod paymentMethod = null;

  @SerializedName("_customInfo")
  private CustomInfo customInfo = null;

  public Transaction userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user&#39;s account ID according to your systems. Note that user IDs are case sensitive.
   * @return userId
  **/
  @ApiModelProperty(value = "The user's account ID according to your systems. Note that user IDs are case sensitive.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Transaction sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The user&#39;s current session ID, used to tie a user&#39;s action before and after login or account creation. Required if no user_id values is provided.
   * @return sessionId
  **/
  @ApiModelProperty(value = "The user's current session ID, used to tie a user's action before and after login or account creation. Required if no user_id values is provided.")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public Transaction orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The ID for tracking this order in your system.
   * @return orderId
  **/
  @ApiModelProperty(required = true, value = "The ID for tracking this order in your system.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Transaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The ID for identifying this transaction. Important for tracking transactions, and linking different parts of the same transaction together, e.g., linking a refund to its original transaction.
   * @return transactionId
  **/
  @ApiModelProperty(value = "The ID for identifying this transaction. Important for tracking transactions, and linking different parts of the same transaction together, e.g., linking a refund to its original transaction.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Transaction deviceIp(String deviceIp) {
    this.deviceIp = deviceIp;
    return this;
  }

   /**
   * IP address of the request made by the user. Recommended for historical backfills and customers with mobile apps.
   * @return deviceIp
  **/
  @ApiModelProperty(value = "IP address of the request made by the user. Recommended for historical backfills and customers with mobile apps.")
  public String getDeviceIp() {
    return deviceIp;
  }

  public void setDeviceIp(String deviceIp) {
    this.deviceIp = deviceIp;
  }

  public Transaction originTimestamp(String originTimestamp) {
    this.originTimestamp = originTimestamp;
    return this;
  }

   /**
   * Represents the time the event occured in your system. Send as a UNIX timestamp in milliseconds in string.
   * @return originTimestamp
  **/
  @ApiModelProperty(value = "Represents the time the event occured in your system. Send as a UNIX timestamp in milliseconds in string.")
  public String getOriginTimestamp() {
    return originTimestamp;
  }

  public void setOriginTimestamp(String originTimestamp) {
    this.originTimestamp = originTimestamp;
  }

  public Transaction userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Email of the user creating this order. Note - If the user&#39;s email is also their account ID in your system, set both the userId and userEmail fields to their email address.
   * @return userEmail
  **/
  @ApiModelProperty(value = "Email of the user creating this order. Note - If the user's email is also their account ID in your system, set both the userId and userEmail fields to their email address.")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public Transaction amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The item unit price in numbers, in the base unit of the currency_code.e.g. \&quot;2500\&quot;
   * @return amount
  **/
  @ApiModelProperty(value = "The item unit price in numbers, in the base unit of the currency_code.e.g. \"2500\"")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Transaction currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The [ISO-4217](http://en.wikipedia.org/wiki/ISO_4217) currency code for the amount. e.g., USD, INR alternative currencies, like bitcoin or points systems.
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The [ISO-4217](http://en.wikipedia.org/wiki/ISO_4217) currency code for the amount. e.g., USD, INR alternative currencies, like bitcoin or points systems.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Transaction transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * The type of transaction being recorded. e.g. _sale, _authorize, _capture, _void, _refund, _deposit, _withdrawal, _transfer
   * @return transactionType
  **/
  @ApiModelProperty(value = "The type of transaction being recorded. e.g. _sale, _authorize, _capture, _void, _refund, _deposit, _withdrawal, _transfer")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public Transaction transactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Use _transactionStatus to indicate the status of the transaction. The value can be \&quot;_success\&quot; (default value), \&quot;_failure\&quot; or \&quot;_pending\&quot;. For instance, If the transaction was rejected by the payment gateway, set the value to \&quot;_failure\&quot;.
   * @return transactionStatus
  **/
  @ApiModelProperty(required = true, value = "Use _transactionStatus to indicate the status of the transaction. The value can be \"_success\" (default value), \"_failure\" or \"_pending\". For instance, If the transaction was rejected by the payment gateway, set the value to \"_failure\".")
  public String getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public Transaction isFirstTimeBuyer(Boolean isFirstTimeBuyer) {
    this.isFirstTimeBuyer = isFirstTimeBuyer;
    return this;
  }

   /**
   * Is user first time buyer.
   * @return isFirstTimeBuyer
  **/
  @ApiModelProperty(value = "Is user first time buyer.")
  public Boolean getIsFirstTimeBuyer() {
    return isFirstTimeBuyer;
  }

  public void setIsFirstTimeBuyer(Boolean isFirstTimeBuyer) {
    this.isFirstTimeBuyer = isFirstTimeBuyer;
  }

  public Transaction billingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public BillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  public Transaction shippingAddress(ShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public ShippingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(ShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Transaction paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Transaction customInfo(CustomInfo customInfo) {
    this.customInfo = customInfo;
    return this;
  }

   /**
   * Get customInfo
   * @return customInfo
  **/
  @ApiModelProperty(value = "")
  public CustomInfo getCustomInfo() {
    return customInfo;
  }

  public void setCustomInfo(CustomInfo customInfo) {
    this.customInfo = customInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.userId, transaction.userId) &&
        Objects.equals(this.sessionId, transaction.sessionId) &&
        Objects.equals(this.orderId, transaction.orderId) &&
        Objects.equals(this.transactionId, transaction.transactionId) &&
        Objects.equals(this.deviceIp, transaction.deviceIp) &&
        Objects.equals(this.originTimestamp, transaction.originTimestamp) &&
        Objects.equals(this.userEmail, transaction.userEmail) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.currencyCode, transaction.currencyCode) &&
        Objects.equals(this.transactionType, transaction.transactionType) &&
        Objects.equals(this.transactionStatus, transaction.transactionStatus) &&
        Objects.equals(this.isFirstTimeBuyer, transaction.isFirstTimeBuyer) &&
        Objects.equals(this.billingAddress, transaction.billingAddress) &&
        Objects.equals(this.shippingAddress, transaction.shippingAddress) &&
        Objects.equals(this.paymentMethod, transaction.paymentMethod) &&
        Objects.equals(this.customInfo, transaction.customInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, sessionId, orderId, transactionId, deviceIp, originTimestamp, userEmail, amount, currencyCode, transactionType, transactionStatus, isFirstTimeBuyer, billingAddress, shippingAddress, paymentMethod, customInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    deviceIp: ").append(toIndentedString(deviceIp)).append("\n");
    sb.append("    originTimestamp: ").append(toIndentedString(originTimestamp)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    isFirstTimeBuyer: ").append(toIndentedString(isFirstTimeBuyer)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    customInfo: ").append(toIndentedString(customInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

