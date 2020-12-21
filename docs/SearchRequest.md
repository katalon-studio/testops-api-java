

# SearchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchRequestConditions** | [**List&lt;SearchRequestCondition&gt;**](SearchRequestCondition.md) |  |  [optional]
**searchRequestPagination** | [**SearchRequestPagination**](SearchRequestPagination.md) |  |  [optional]
**searchRequestGroupBys** | **List&lt;String&gt;** |  |  [optional]
**searchRequestFunctions** | [**List&lt;SearchRequestFunction&gt;**](SearchRequestFunction.md) |  |  [optional]
**type** | **String** |  |  [optional]
**searchEntity** | [**SearchEntityEnum**](#SearchEntityEnum) |  |  [optional]
**timeZone** | **String** |  |  [optional]



## Enum: SearchEntityEnum

Name | Value
---- | -----
EXECUTION | &quot;Execution&quot;
EXECUTIONTESTSUITE | &quot;ExecutionTestSuite&quot;
EXECUTIONSTATISTICS | &quot;ExecutionStatistics&quot;
EXECUTIONTESTMODULE | &quot;ExecutionTestModule&quot;
EXECUTIONTESTRESULT | &quot;ExecutionTestResult&quot;
EXECUTIONREQUEST | &quot;ExecutionRequest&quot;
INCIDENT | &quot;Incident&quot;
TESTCASE | &quot;TestCase&quot;
TESTSUITE | &quot;TestSuite&quot;
EXECUTIONTESTSTEP | &quot;ExecutionTestStep&quot;
TESTPROJECT | &quot;TestProject&quot;
JOB | &quot;Job&quot;
RUNNINGTESTRUN | &quot;RunningTestRun&quot;
PROJECT | &quot;Project&quot;
APIKEY | &quot;ApiKey&quot;
COMMENT | &quot;Comment&quot;
TEAM | &quot;Team&quot;
ORGANIZATION | &quot;Organization&quot;
USERORGANIZATION | &quot;UserOrganization&quot;
USERTEAM | &quot;UserTeam&quot;
USERINVITATION | &quot;UserInvitation&quot;
USERSSOINVITATION | &quot;UserSsoInvitation&quot;
USERCONFIGURATION | &quot;UserConfiguration&quot;
AGENT | &quot;Agent&quot;
RUNCONFIGURATION | &quot;RunConfiguration&quot;
RELEASE | &quot;Release&quot;
TESTOBJECT | &quot;TestObject&quot;
TESTOBJECTENTITY | &quot;TestObjectEntity&quot;
TESTCASEEXECUTION | &quot;TestCaseExecution&quot;
TESTCASEEXECUTIONSTATUS | &quot;TestCaseExecutionStatus&quot;
RELEASESTATISTICSSTATUS | &quot;ReleaseStatisticsStatus&quot;
TESTCASEEXECUTIONCOMPARISON | &quot;TestCaseExecutionComparison&quot;
TESTCASEEXECUTIONCOMPARISONSTATISTICS | &quot;TestCaseExecutionComparisonStatistics&quot;
TESTCASEPLATFORMSTATISTICS | &quot;TestCasePlatformStatistics&quot;
SCHEDULER | &quot;Scheduler&quot;
EXECUTIONANALYSIS | &quot;ExecutionAnalysis&quot;
EXECUTIONTESTRESULTCATEGORY | &quot;ExecutionTestResultCategory&quot;
EXECUTIONTESTRESULTGROUP | &quot;ExecutionTestResultGroup&quot;
EXECUTIONTESTRESULTTESTOBJECTENTITY | &quot;ExecutionTestResultTestObjectEntity&quot;
EXECUTIONFILE | &quot;ExecutionFile&quot;
TESTSUITECOLLECTION | &quot;TestSuiteCollection&quot;
TESTSUITECOLLECTIONENTITY | &quot;TestSuiteCollectionEntity&quot;
TESTCASEPRIORITY | &quot;TestCasePriority&quot;
EXTERNALCONNECTION | &quot;ExternalConnection&quot;
PLATFORMSTATISTICS | &quot;PlatformStatistics&quot;
TESTPROJECTFILE | &quot;TestProjectFile&quot;
PROJECTSTATISTICS | &quot;ProjectStatistics&quot;
PROJECTREQUIREMENTSTATISTIC | &quot;ProjectRequirementStatistic&quot;
TESTCASEREQUIREMENTSTATISTIC | &quot;TestCaseRequirementStatistic&quot;
USERORGANIZATIONFEATURE | &quot;UserOrganizationFeature&quot;
MACHINE | &quot;Machine&quot;
LICENSEKEY | &quot;LicenseKey&quot;
K8SAGENT | &quot;K8SAgent&quot;
CIRCLECIAGENT | &quot;CircleCiAgent&quot;
JOBSUMMARY | &quot;JobSummary&quot;
KATALONRECORDERBACKUP | &quot;KatalonRecorderBackup&quot;
EXTERNALDEFECT | &quot;ExternalDefect&quot;
EXTERNALREQUIREMENT | &quot;ExternalRequirement&quot;
EXTERNALTRACEABILITY | &quot;ExternalTraceability&quot;
REQUIREMENTTESTRUNCOVERAGE | &quot;RequirementTestRunCoverage&quot;
WHITELISTIP | &quot;WhitelistIp&quot;
KSSESSION | &quot;KsSession&quot;
CIDASHBOARDSTATISTICS | &quot;CiDashboardStatistics&quot;
CHECKPOINT | &quot;Checkpoint&quot;
KEYESEXECUTION | &quot;KeyesExecution&quot;
RECENTPROJECT | &quot;RecentProject&quot;
JIRAISSUE | &quot;JiraIssue&quot;
SLACKCONNECTION | &quot;SlackConnection&quot;
BASELINE | &quot;Baseline&quot;
BASELINECOLLECTION | &quot;BaselineCollection&quot;
TESTCASEFLAKINESS | &quot;TestCaseFlakiness&quot;


## Implemented Interfaces

* Serializable


