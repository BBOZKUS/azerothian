package com.mithrenduin.azerothian.models.blizzard.character;

import java.util.List;

public class Achievement {
	
	private List<Long> achievementsCompleted;
	private List<Long> achievementsCompletedTimestamp;
	private List<Long> criteria;
	private List<Long> criteriaQuantity;
	private List<Long> criteriaTimestamp;
	
	public List<Long> getAchievementsCompleted() {
		return achievementsCompleted;
	}
	
	public void setAchievementsCompleted(List<Long> achievementsCompleted) {
		this.achievementsCompleted = achievementsCompleted;
	}
	
	public List<Long> getAchievementsCompletedTimestamp() {
		return achievementsCompletedTimestamp;
	}
	
	public void setAchievementsCompletedTimestamp(List<Long> achievementsCompletedTimestamp) {
		this.achievementsCompletedTimestamp = achievementsCompletedTimestamp;
	}
	
	public List<Long> getCriteria() {
		return criteria;
	}
	
	public void setCriteria(List<Long> criteria) {
		this.criteria = criteria;
	}
	
	public List<Long> getCriteriaQuantity() {
		return criteriaQuantity;
	}
	
	public void setCriteriaQuantity(List<Long> criteriaQuantity) {
		this.criteriaQuantity = criteriaQuantity;
	}
	
	public List<Long> getCriteriaTimestamp() {
		return criteriaTimestamp;
	}
	
	public void setCriteriaTimestamp(List<Long> criteriaTimestamp) {
		this.criteriaTimestamp = criteriaTimestamp;
	}

	@Override
	public String toString() {
		return "Achievement [achievementsCompleted=" + achievementsCompleted + ", achievementsCompletedTimestamp="
				+ achievementsCompletedTimestamp + ", criteria=" + criteria + ", criteriaQuantity=" + criteriaQuantity
				+ ", criteriaTimestamp=" + criteriaTimestamp + "]";
	}
	
	
	
}
