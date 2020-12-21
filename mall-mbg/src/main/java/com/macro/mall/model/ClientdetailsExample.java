package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class ClientdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientdetailsExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAppidIsNull() {
            addCriterion("appId is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("appId is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("appId =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("appId <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("appId >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("appId >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("appId <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("appId <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("appId like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("appId not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("appId in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("appId not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("appId between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("appId not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andResourceidsIsNull() {
            addCriterion("resourceIds is null");
            return (Criteria) this;
        }

        public Criteria andResourceidsIsNotNull() {
            addCriterion("resourceIds is not null");
            return (Criteria) this;
        }

        public Criteria andResourceidsEqualTo(String value) {
            addCriterion("resourceIds =", value, "resourceids");
            return (Criteria) this;
        }

        public Criteria andResourceidsNotEqualTo(String value) {
            addCriterion("resourceIds <>", value, "resourceids");
            return (Criteria) this;
        }

        public Criteria andResourceidsGreaterThan(String value) {
            addCriterion("resourceIds >", value, "resourceids");
            return (Criteria) this;
        }

        public Criteria andResourceidsGreaterThanOrEqualTo(String value) {
            addCriterion("resourceIds >=", value, "resourceids");
            return (Criteria) this;
        }

        public Criteria andResourceidsLessThan(String value) {
            addCriterion("resourceIds <", value, "resourceids");
            return (Criteria) this;
        }

        public Criteria andResourceidsLessThanOrEqualTo(String value) {
            addCriterion("resourceIds <=", value, "resourceids");
            return (Criteria) this;
        }

        public Criteria andResourceidsLike(String value) {
            addCriterion("resourceIds like", value, "resourceids");
            return (Criteria) this;
        }

        public Criteria andResourceidsNotLike(String value) {
            addCriterion("resourceIds not like", value, "resourceids");
            return (Criteria) this;
        }

        public Criteria andResourceidsIn(List<String> values) {
            addCriterion("resourceIds in", values, "resourceids");
            return (Criteria) this;
        }

        public Criteria andResourceidsNotIn(List<String> values) {
            addCriterion("resourceIds not in", values, "resourceids");
            return (Criteria) this;
        }

        public Criteria andResourceidsBetween(String value1, String value2) {
            addCriterion("resourceIds between", value1, value2, "resourceids");
            return (Criteria) this;
        }

        public Criteria andResourceidsNotBetween(String value1, String value2) {
            addCriterion("resourceIds not between", value1, value2, "resourceids");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNull() {
            addCriterion("appSecret is null");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNotNull() {
            addCriterion("appSecret is not null");
            return (Criteria) this;
        }

        public Criteria andAppsecretEqualTo(String value) {
            addCriterion("appSecret =", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotEqualTo(String value) {
            addCriterion("appSecret <>", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThan(String value) {
            addCriterion("appSecret >", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThanOrEqualTo(String value) {
            addCriterion("appSecret >=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThan(String value) {
            addCriterion("appSecret <", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThanOrEqualTo(String value) {
            addCriterion("appSecret <=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLike(String value) {
            addCriterion("appSecret like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotLike(String value) {
            addCriterion("appSecret not like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretIn(List<String> values) {
            addCriterion("appSecret in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotIn(List<String> values) {
            addCriterion("appSecret not in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretBetween(String value1, String value2) {
            addCriterion("appSecret between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotBetween(String value1, String value2) {
            addCriterion("appSecret not between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("scope is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("scope is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(String value) {
            addCriterion("scope =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(String value) {
            addCriterion("scope <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(String value) {
            addCriterion("scope >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(String value) {
            addCriterion("scope >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(String value) {
            addCriterion("scope <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(String value) {
            addCriterion("scope <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLike(String value) {
            addCriterion("scope like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotLike(String value) {
            addCriterion("scope not like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<String> values) {
            addCriterion("scope in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<String> values) {
            addCriterion("scope not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(String value1, String value2) {
            addCriterion("scope between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(String value1, String value2) {
            addCriterion("scope not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andGranttypesIsNull() {
            addCriterion("grantTypes is null");
            return (Criteria) this;
        }

        public Criteria andGranttypesIsNotNull() {
            addCriterion("grantTypes is not null");
            return (Criteria) this;
        }

        public Criteria andGranttypesEqualTo(String value) {
            addCriterion("grantTypes =", value, "granttypes");
            return (Criteria) this;
        }

        public Criteria andGranttypesNotEqualTo(String value) {
            addCriterion("grantTypes <>", value, "granttypes");
            return (Criteria) this;
        }

        public Criteria andGranttypesGreaterThan(String value) {
            addCriterion("grantTypes >", value, "granttypes");
            return (Criteria) this;
        }

        public Criteria andGranttypesGreaterThanOrEqualTo(String value) {
            addCriterion("grantTypes >=", value, "granttypes");
            return (Criteria) this;
        }

        public Criteria andGranttypesLessThan(String value) {
            addCriterion("grantTypes <", value, "granttypes");
            return (Criteria) this;
        }

        public Criteria andGranttypesLessThanOrEqualTo(String value) {
            addCriterion("grantTypes <=", value, "granttypes");
            return (Criteria) this;
        }

        public Criteria andGranttypesLike(String value) {
            addCriterion("grantTypes like", value, "granttypes");
            return (Criteria) this;
        }

        public Criteria andGranttypesNotLike(String value) {
            addCriterion("grantTypes not like", value, "granttypes");
            return (Criteria) this;
        }

        public Criteria andGranttypesIn(List<String> values) {
            addCriterion("grantTypes in", values, "granttypes");
            return (Criteria) this;
        }

        public Criteria andGranttypesNotIn(List<String> values) {
            addCriterion("grantTypes not in", values, "granttypes");
            return (Criteria) this;
        }

        public Criteria andGranttypesBetween(String value1, String value2) {
            addCriterion("grantTypes between", value1, value2, "granttypes");
            return (Criteria) this;
        }

        public Criteria andGranttypesNotBetween(String value1, String value2) {
            addCriterion("grantTypes not between", value1, value2, "granttypes");
            return (Criteria) this;
        }

        public Criteria andRedirecturlIsNull() {
            addCriterion("redirectUrl is null");
            return (Criteria) this;
        }

        public Criteria andRedirecturlIsNotNull() {
            addCriterion("redirectUrl is not null");
            return (Criteria) this;
        }

        public Criteria andRedirecturlEqualTo(String value) {
            addCriterion("redirectUrl =", value, "redirecturl");
            return (Criteria) this;
        }

        public Criteria andRedirecturlNotEqualTo(String value) {
            addCriterion("redirectUrl <>", value, "redirecturl");
            return (Criteria) this;
        }

        public Criteria andRedirecturlGreaterThan(String value) {
            addCriterion("redirectUrl >", value, "redirecturl");
            return (Criteria) this;
        }

        public Criteria andRedirecturlGreaterThanOrEqualTo(String value) {
            addCriterion("redirectUrl >=", value, "redirecturl");
            return (Criteria) this;
        }

        public Criteria andRedirecturlLessThan(String value) {
            addCriterion("redirectUrl <", value, "redirecturl");
            return (Criteria) this;
        }

        public Criteria andRedirecturlLessThanOrEqualTo(String value) {
            addCriterion("redirectUrl <=", value, "redirecturl");
            return (Criteria) this;
        }

        public Criteria andRedirecturlLike(String value) {
            addCriterion("redirectUrl like", value, "redirecturl");
            return (Criteria) this;
        }

        public Criteria andRedirecturlNotLike(String value) {
            addCriterion("redirectUrl not like", value, "redirecturl");
            return (Criteria) this;
        }

        public Criteria andRedirecturlIn(List<String> values) {
            addCriterion("redirectUrl in", values, "redirecturl");
            return (Criteria) this;
        }

        public Criteria andRedirecturlNotIn(List<String> values) {
            addCriterion("redirectUrl not in", values, "redirecturl");
            return (Criteria) this;
        }

        public Criteria andRedirecturlBetween(String value1, String value2) {
            addCriterion("redirectUrl between", value1, value2, "redirecturl");
            return (Criteria) this;
        }

        public Criteria andRedirecturlNotBetween(String value1, String value2) {
            addCriterion("redirectUrl not between", value1, value2, "redirecturl");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIsNull() {
            addCriterion("authorities is null");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIsNotNull() {
            addCriterion("authorities is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesEqualTo(String value) {
            addCriterion("authorities =", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesNotEqualTo(String value) {
            addCriterion("authorities <>", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesGreaterThan(String value) {
            addCriterion("authorities >", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesGreaterThanOrEqualTo(String value) {
            addCriterion("authorities >=", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesLessThan(String value) {
            addCriterion("authorities <", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesLessThanOrEqualTo(String value) {
            addCriterion("authorities <=", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesLike(String value) {
            addCriterion("authorities like", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesNotLike(String value) {
            addCriterion("authorities not like", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIn(List<String> values) {
            addCriterion("authorities in", values, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesNotIn(List<String> values) {
            addCriterion("authorities not in", values, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesBetween(String value1, String value2) {
            addCriterion("authorities between", value1, value2, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesNotBetween(String value1, String value2) {
            addCriterion("authorities not between", value1, value2, "authorities");
            return (Criteria) this;
        }

        public Criteria andAccessTokenValidityIsNull() {
            addCriterion("access_token_validity is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenValidityIsNotNull() {
            addCriterion("access_token_validity is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenValidityEqualTo(Integer value) {
            addCriterion("access_token_validity =", value, "accessTokenValidity");
            return (Criteria) this;
        }

        public Criteria andAccessTokenValidityNotEqualTo(Integer value) {
            addCriterion("access_token_validity <>", value, "accessTokenValidity");
            return (Criteria) this;
        }

        public Criteria andAccessTokenValidityGreaterThan(Integer value) {
            addCriterion("access_token_validity >", value, "accessTokenValidity");
            return (Criteria) this;
        }

        public Criteria andAccessTokenValidityGreaterThanOrEqualTo(Integer value) {
            addCriterion("access_token_validity >=", value, "accessTokenValidity");
            return (Criteria) this;
        }

        public Criteria andAccessTokenValidityLessThan(Integer value) {
            addCriterion("access_token_validity <", value, "accessTokenValidity");
            return (Criteria) this;
        }

        public Criteria andAccessTokenValidityLessThanOrEqualTo(Integer value) {
            addCriterion("access_token_validity <=", value, "accessTokenValidity");
            return (Criteria) this;
        }

        public Criteria andAccessTokenValidityIn(List<Integer> values) {
            addCriterion("access_token_validity in", values, "accessTokenValidity");
            return (Criteria) this;
        }

        public Criteria andAccessTokenValidityNotIn(List<Integer> values) {
            addCriterion("access_token_validity not in", values, "accessTokenValidity");
            return (Criteria) this;
        }

        public Criteria andAccessTokenValidityBetween(Integer value1, Integer value2) {
            addCriterion("access_token_validity between", value1, value2, "accessTokenValidity");
            return (Criteria) this;
        }

        public Criteria andAccessTokenValidityNotBetween(Integer value1, Integer value2) {
            addCriterion("access_token_validity not between", value1, value2, "accessTokenValidity");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenValidityIsNull() {
            addCriterion("refresh_token_validity is null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenValidityIsNotNull() {
            addCriterion("refresh_token_validity is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenValidityEqualTo(Integer value) {
            addCriterion("refresh_token_validity =", value, "refreshTokenValidity");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenValidityNotEqualTo(Integer value) {
            addCriterion("refresh_token_validity <>", value, "refreshTokenValidity");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenValidityGreaterThan(Integer value) {
            addCriterion("refresh_token_validity >", value, "refreshTokenValidity");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenValidityGreaterThanOrEqualTo(Integer value) {
            addCriterion("refresh_token_validity >=", value, "refreshTokenValidity");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenValidityLessThan(Integer value) {
            addCriterion("refresh_token_validity <", value, "refreshTokenValidity");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenValidityLessThanOrEqualTo(Integer value) {
            addCriterion("refresh_token_validity <=", value, "refreshTokenValidity");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenValidityIn(List<Integer> values) {
            addCriterion("refresh_token_validity in", values, "refreshTokenValidity");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenValidityNotIn(List<Integer> values) {
            addCriterion("refresh_token_validity not in", values, "refreshTokenValidity");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenValidityBetween(Integer value1, Integer value2) {
            addCriterion("refresh_token_validity between", value1, value2, "refreshTokenValidity");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenValidityNotBetween(Integer value1, Integer value2) {
            addCriterion("refresh_token_validity not between", value1, value2, "refreshTokenValidity");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationIsNull() {
            addCriterion("additionalInformation is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationIsNotNull() {
            addCriterion("additionalInformation is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationEqualTo(String value) {
            addCriterion("additionalInformation =", value, "additionalinformation");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationNotEqualTo(String value) {
            addCriterion("additionalInformation <>", value, "additionalinformation");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationGreaterThan(String value) {
            addCriterion("additionalInformation >", value, "additionalinformation");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationGreaterThanOrEqualTo(String value) {
            addCriterion("additionalInformation >=", value, "additionalinformation");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationLessThan(String value) {
            addCriterion("additionalInformation <", value, "additionalinformation");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationLessThanOrEqualTo(String value) {
            addCriterion("additionalInformation <=", value, "additionalinformation");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationLike(String value) {
            addCriterion("additionalInformation like", value, "additionalinformation");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationNotLike(String value) {
            addCriterion("additionalInformation not like", value, "additionalinformation");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationIn(List<String> values) {
            addCriterion("additionalInformation in", values, "additionalinformation");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationNotIn(List<String> values) {
            addCriterion("additionalInformation not in", values, "additionalinformation");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationBetween(String value1, String value2) {
            addCriterion("additionalInformation between", value1, value2, "additionalinformation");
            return (Criteria) this;
        }

        public Criteria andAdditionalinformationNotBetween(String value1, String value2) {
            addCriterion("additionalInformation not between", value1, value2, "additionalinformation");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesIsNull() {
            addCriterion("autoApproveScopes is null");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesIsNotNull() {
            addCriterion("autoApproveScopes is not null");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesEqualTo(String value) {
            addCriterion("autoApproveScopes =", value, "autoapprovescopes");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesNotEqualTo(String value) {
            addCriterion("autoApproveScopes <>", value, "autoapprovescopes");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesGreaterThan(String value) {
            addCriterion("autoApproveScopes >", value, "autoapprovescopes");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesGreaterThanOrEqualTo(String value) {
            addCriterion("autoApproveScopes >=", value, "autoapprovescopes");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesLessThan(String value) {
            addCriterion("autoApproveScopes <", value, "autoapprovescopes");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesLessThanOrEqualTo(String value) {
            addCriterion("autoApproveScopes <=", value, "autoapprovescopes");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesLike(String value) {
            addCriterion("autoApproveScopes like", value, "autoapprovescopes");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesNotLike(String value) {
            addCriterion("autoApproveScopes not like", value, "autoapprovescopes");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesIn(List<String> values) {
            addCriterion("autoApproveScopes in", values, "autoapprovescopes");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesNotIn(List<String> values) {
            addCriterion("autoApproveScopes not in", values, "autoapprovescopes");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesBetween(String value1, String value2) {
            addCriterion("autoApproveScopes between", value1, value2, "autoapprovescopes");
            return (Criteria) this;
        }

        public Criteria andAutoapprovescopesNotBetween(String value1, String value2) {
            addCriterion("autoApproveScopes not between", value1, value2, "autoapprovescopes");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}