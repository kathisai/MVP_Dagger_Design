package com.sample.wireviewer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Meta {

    @SerializedName("attribution")
    @Expose
    private Object attribution;
    @SerializedName("signal_from")
    @Expose
    private String signalFrom;
    @SerializedName("maintainer")
    @Expose
    private Maintainer maintainer;
    @SerializedName("is_stackexchange")
    @Expose
    private Object isStackexchange;
    @SerializedName("blockgroup")
    @Expose
    private Object blockgroup;
    @SerializedName("src_id")
    @Expose
    private Integer srcId;
    @SerializedName("unsafe")
    @Expose
    private Integer unsafe;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("repo")
    @Expose
    private String repo;
    @SerializedName("src_options")
    @Expose
    private SrcOptions srcOptions;
    @SerializedName("tab")
    @Expose
    private String tab;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("perl_module")
    @Expose
    private String perlModule;
    @SerializedName("example_query")
    @Expose
    private String exampleQuery;
    @SerializedName("dev_milestone")
    @Expose
    private String devMilestone;
    @SerializedName("src_domain")
    @Expose
    private String srcDomain;
    @SerializedName("developer")
    @Expose
    private List<Developer> developer = null;
    @SerializedName("src_url")
    @Expose
    private Object srcUrl;
    @SerializedName("live_date")
    @Expose
    private Object liveDate;
    @SerializedName("producer")
    @Expose
    private Object producer;
    @SerializedName("created_date")
    @Expose
    private Object createdDate;
    @SerializedName("js_callback_name")
    @Expose
    private String jsCallbackName;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("topic")
    @Expose
    private List<String> topic = null;
    @SerializedName("src_name")
    @Expose
    private String srcName;
    @SerializedName("dev_date")
    @Expose
    private Object devDate;
    @SerializedName("designer")
    @Expose
    private Object designer;
    @SerializedName("production_state")
    @Expose
    private String productionState;

    public Object getAttribution() {
        return attribution;
    }

    public void setAttribution(Object attribution) {
        this.attribution = attribution;
    }

    public String getSignalFrom() {
        return signalFrom;
    }

    public void setSignalFrom(String signalFrom) {
        this.signalFrom = signalFrom;
    }

    public Maintainer getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(Maintainer maintainer) {
        this.maintainer = maintainer;
    }

    public Object getIsStackexchange() {
        return isStackexchange;
    }

    public void setIsStackexchange(Object isStackexchange) {
        this.isStackexchange = isStackexchange;
    }

    public Object getBlockgroup() {
        return blockgroup;
    }

    public void setBlockgroup(Object blockgroup) {
        this.blockgroup = blockgroup;
    }

    public Integer getSrcId() {
        return srcId;
    }

    public void setSrcId(Integer srcId) {
        this.srcId = srcId;
    }

    public Integer getUnsafe() {
        return unsafe;
    }

    public void setUnsafe(Integer unsafe) {
        this.unsafe = unsafe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public SrcOptions getSrcOptions() {
        return srcOptions;
    }

    public void setSrcOptions(SrcOptions srcOptions) {
        this.srcOptions = srcOptions;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPerlModule() {
        return perlModule;
    }

    public void setPerlModule(String perlModule) {
        this.perlModule = perlModule;
    }

    public String getExampleQuery() {
        return exampleQuery;
    }

    public void setExampleQuery(String exampleQuery) {
        this.exampleQuery = exampleQuery;
    }

    public String getDevMilestone() {
        return devMilestone;
    }

    public void setDevMilestone(String devMilestone) {
        this.devMilestone = devMilestone;
    }

    public String getSrcDomain() {
        return srcDomain;
    }

    public void setSrcDomain(String srcDomain) {
        this.srcDomain = srcDomain;
    }

    public List<Developer> getDeveloper() {
        return developer;
    }

    public void setDeveloper(List<Developer> developer) {
        this.developer = developer;
    }

    public Object getSrcUrl() {
        return srcUrl;
    }

    public void setSrcUrl(Object srcUrl) {
        this.srcUrl = srcUrl;
    }

    public Object getLiveDate() {
        return liveDate;
    }

    public void setLiveDate(Object liveDate) {
        this.liveDate = liveDate;
    }

    public Object getProducer() {
        return producer;
    }

    public void setProducer(Object producer) {
        this.producer = producer;
    }

    public Object getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Object createdDate) {
        this.createdDate = createdDate;
    }

    public String getJsCallbackName() {
        return jsCallbackName;
    }

    public void setJsCallbackName(String jsCallbackName) {
        this.jsCallbackName = jsCallbackName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getTopic() {
        return topic;
    }

    public void setTopic(List<String> topic) {
        this.topic = topic;
    }

    public String getSrcName() {
        return srcName;
    }

    public void setSrcName(String srcName) {
        this.srcName = srcName;
    }

    public Object getDevDate() {
        return devDate;
    }

    public void setDevDate(Object devDate) {
        this.devDate = devDate;
    }

    public Object getDesigner() {
        return designer;
    }

    public void setDesigner(Object designer) {
        this.designer = designer;
    }

    public String getProductionState() {
        return productionState;
    }

    public void setProductionState(String productionState) {
        this.productionState = productionState;
    }

}