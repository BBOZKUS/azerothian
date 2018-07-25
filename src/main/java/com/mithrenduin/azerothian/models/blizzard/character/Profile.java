package com.mithrenduin.azerothian.models.blizzard.character;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)	
public class Profile {
		private String name;
		private String realm;
		private String battlegroup;
		private int actualClass;
		private int race;
		private int gender;
		private int level;
		private int achievementPoints;
		private String thumbnail;
		private String calcClass;
		private int faction;
		private int totalHonorableKills;
		private Achievement achievements;
		
		public Profile() {
			
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getRealm() {
			return realm;
		}
		
		public void setRealm(String realm) {
			this.realm = realm;
		}
		
		public String getBattlegroup() {
			return battlegroup;
		}
		
		public void setBattlegroup(String battlegroup) {
			this.battlegroup = battlegroup;
		}
		
		@JsonProperty("class")
		public int getActualClass() {
			return actualClass;
		}
		
		@JsonProperty("class")
		public void setActualClass(int actualClass) {
			this.actualClass = actualClass;
		}
		
		public int getRace() {
			return race;
		}
		
		public void setRace(int race) {
			this.race = race;
		}
		
		public int getGender() {
			return gender;
		}
		
		public void setGender(int gender) {
			this.gender = gender;
		}
		
		public int getLevel() {
			return level;
		}
		
		public void setLevel(int level) {
			this.level = level;
		}
		
		public int getAchievementPoints() {
			return achievementPoints;
		}
		
		public void setAchievementPoints(int achievementPoints) {
			this.achievementPoints = achievementPoints;
		}
		
		public String getThumbnail() {
			return thumbnail;
		}
		
		public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
		}
		
		public String getCalcClass() {
			return calcClass;
		}
		
		public void setCalcClass(String calcClass) {
			this.calcClass = calcClass;
		}
		
		public int getFaction() {
			return faction;
		}
		
		public void setFaction(int faction) {
			this.faction = faction;
		}
		
		public int getTotalHonorableKills() {
			return totalHonorableKills;
		}
		
		public void setTotalHonorableKills(int totalHonorableKills) {
			this.totalHonorableKills = totalHonorableKills;
		}
		

		public Achievement getAchievements() {
			return achievements;
		}

		public void setAchievements(Achievement achievements) {
			this.achievements = achievements;
		}
		
		@Override
		public String toString() {
			return "Profile [name=" + name + ", realm=" + realm + ", battlegroup=" + battlegroup + ", actualClass="
					+ actualClass + ", race=" + race + ", gender=" + gender + ", level=" + level
					+ ", achievementPoints=" + achievementPoints + ", thumbnail=" + thumbnail + ", calcClass="
					+ calcClass + ", faction=" + faction + ", totalHonorableKills=" + totalHonorableKills + ", achievements=" + achievements + "]";
		}


}
