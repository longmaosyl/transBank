package com.etransfar.transBank.model;

import java.math.BigDecimal;
import java.util.Date;

public class TbAccountDetail {
    private Integer id;

    private Integer accountId;

    private String serialNo;

    private Byte tradeChannel;

    private Byte tradeType;

    private String accountNo;

    private String accountName;

    private String bankNo;

    private String bankName;

    private String oppAccountNo;

    private String oppAccountName;

    private String oppBankNo;

    private String oppBankName;

    private Byte curCode;

    private BigDecimal tradeAmount;

    private String tradeDate;

    private String tradeTime;

    private Integer printTimes;

    private String sumCode;

    private String protectCode;

    private String purpose;

    private String postScript;

    private String memo;

    private String reserve;

    private BigDecimal balance;

    private String receipt;

    private Byte isDelete;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public Byte getTradeChannel() {
        return tradeChannel;
    }

    public void setTradeChannel(Byte tradeChannel) {
        this.tradeChannel = tradeChannel;
    }

    public Byte getTradeType() {
        return tradeType;
    }

    public void setTradeType(Byte tradeType) {
        this.tradeType = tradeType;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getOppAccountNo() {
        return oppAccountNo;
    }

    public void setOppAccountNo(String oppAccountNo) {
        this.oppAccountNo = oppAccountNo;
    }

    public String getOppAccountName() {
        return oppAccountName;
    }

    public void setOppAccountName(String oppAccountName) {
        this.oppAccountName = oppAccountName;
    }

    public String getOppBankNo() {
        return oppBankNo;
    }

    public void setOppBankNo(String oppBankNo) {
        this.oppBankNo = oppBankNo;
    }

    public String getOppBankName() {
        return oppBankName;
    }

    public void setOppBankName(String oppBankName) {
        this.oppBankName = oppBankName;
    }

    public Byte getCurCode() {
        return curCode;
    }

    public void setCurCode(Byte curCode) {
        this.curCode = curCode;
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Integer getPrintTimes() {
        return printTimes;
    }

    public void setPrintTimes(Integer printTimes) {
        this.printTimes = printTimes;
    }

    public String getSumCode() {
        return sumCode;
    }

    public void setSumCode(String sumCode) {
        this.sumCode = sumCode;
    }

    public String getProtectCode() {
        return protectCode;
    }

    public void setProtectCode(String protectCode) {
        this.protectCode = protectCode;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPostScript() {
        return postScript;
    }

    public void setPostScript(String postScript) {
        this.postScript = postScript;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}