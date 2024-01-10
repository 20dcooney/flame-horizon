package com.flamehorizon.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Participant{
    @JsonProperty("allInPings")
    public int getAllInPings() { 
		 return this.allInPings; } 
    public void setAllInPings(int allInPings) { 
		 this.allInPings = allInPings; } 
    int allInPings;
    @JsonProperty("assistMePings") 
    public int getAssistMePings() { 
		 return this.assistMePings; } 
    public void setAssistMePings(int assistMePings) { 
		 this.assistMePings = assistMePings; } 
    int assistMePings;
    @JsonProperty("assists") 
    public int getAssists() { 
		 return this.assists; } 
    public void setAssists(int assists) { 
		 this.assists = assists; } 
    int assists;
    @JsonProperty("baitPings") 
    public int getBaitPings() { 
		 return this.baitPings; } 
    public void setBaitPings(int baitPings) { 
		 this.baitPings = baitPings; } 
    int baitPings;
    @JsonProperty("baronKills") 
    public int getBaronKills() { 
		 return this.baronKills; } 
    public void setBaronKills(int baronKills) { 
		 this.baronKills = baronKills; } 
    int baronKills;
    @JsonProperty("basicPings") 
    public int getBasicPings() { 
		 return this.basicPings; } 
    public void setBasicPings(int basicPings) { 
		 this.basicPings = basicPings; } 
    int basicPings;
    @JsonProperty("bountyLevel") 
    public int getBountyLevel() { 
		 return this.bountyLevel; } 
    public void setBountyLevel(int bountyLevel) { 
		 this.bountyLevel = bountyLevel; } 
    int bountyLevel;
    @JsonProperty("challenges") 
    public Challenges getChallenges() {
		 return this.challenges; } 
    public void setChallenges(Challenges challenges) {
		 this.challenges = challenges; } 
    Challenges challenges;
    @JsonProperty("champExperience") 
    public int getChampExperience() { 
		 return this.champExperience; } 
    public void setChampExperience(int champExperience) { 
		 this.champExperience = champExperience; } 
    int champExperience;
    @JsonProperty("champLevel") 
    public int getChampLevel() { 
		 return this.champLevel; } 
    public void setChampLevel(int champLevel) { 
		 this.champLevel = champLevel; } 
    int champLevel;
    @JsonProperty("championId") 
    public int getChampionId() { 
		 return this.championId; } 
    public void setChampionId(int championId) { 
		 this.championId = championId; } 
    int championId;
    @JsonProperty("championName") 
    public String getChampionName() { 
		 return this.championName; } 
    public void setChampionName(String championName) { 
		 this.championName = championName; } 
    String championName;
    @JsonProperty("championTransform") 
    public int getChampionTransform() { 
		 return this.championTransform; } 
    public void setChampionTransform(int championTransform) { 
		 this.championTransform = championTransform; } 
    int championTransform;
    @JsonProperty("commandPings") 
    public int getCommandPings() { 
		 return this.commandPings; } 
    public void setCommandPings(int commandPings) { 
		 this.commandPings = commandPings; } 
    int commandPings;
    @JsonProperty("consumablesPurchased") 
    public int getConsumablesPurchased() { 
		 return this.consumablesPurchased; } 
    public void setConsumablesPurchased(int consumablesPurchased) { 
		 this.consumablesPurchased = consumablesPurchased; } 
    int consumablesPurchased;
    @JsonProperty("damageDealtToBuildings") 
    public int getDamageDealtToBuildings() { 
		 return this.damageDealtToBuildings; } 
    public void setDamageDealtToBuildings(int damageDealtToBuildings) { 
		 this.damageDealtToBuildings = damageDealtToBuildings; } 
    int damageDealtToBuildings;
    @JsonProperty("damageDealtToObjectives") 
    public int getDamageDealtToObjectives() { 
		 return this.damageDealtToObjectives; } 
    public void setDamageDealtToObjectives(int damageDealtToObjectives) { 
		 this.damageDealtToObjectives = damageDealtToObjectives; } 
    int damageDealtToObjectives;
    @JsonProperty("damageDealtToTurrets") 
    public int getDamageDealtToTurrets() { 
		 return this.damageDealtToTurrets; } 
    public void setDamageDealtToTurrets(int damageDealtToTurrets) { 
		 this.damageDealtToTurrets = damageDealtToTurrets; } 
    int damageDealtToTurrets;
    @JsonProperty("damageSelfMitigated") 
    public int getDamageSelfMitigated() { 
		 return this.damageSelfMitigated; } 
    public void setDamageSelfMitigated(int damageSelfMitigated) { 
		 this.damageSelfMitigated = damageSelfMitigated; } 
    int damageSelfMitigated;
    @JsonProperty("dangerPings") 
    public int getDangerPings() { 
		 return this.dangerPings; } 
    public void setDangerPings(int dangerPings) { 
		 this.dangerPings = dangerPings; } 
    int dangerPings;
    @JsonProperty("deaths") 
    public int getDeaths() { 
		 return this.deaths; } 
    public void setDeaths(int deaths) { 
		 this.deaths = deaths; } 
    int deaths;
    @JsonProperty("detectorWardsPlaced") 
    public int getDetectorWardsPlaced() { 
		 return this.detectorWardsPlaced; } 
    public void setDetectorWardsPlaced(int detectorWardsPlaced) { 
		 this.detectorWardsPlaced = detectorWardsPlaced; } 
    int detectorWardsPlaced;
    @JsonProperty("doubleKills") 
    public int getDoubleKills() { 
		 return this.doubleKills; } 
    public void setDoubleKills(int doubleKills) { 
		 this.doubleKills = doubleKills; } 
    int doubleKills;
    @JsonProperty("dragonKills") 
    public int getDragonKills() { 
		 return this.dragonKills; } 
    public void setDragonKills(int dragonKills) { 
		 this.dragonKills = dragonKills; } 
    int dragonKills;
    @JsonProperty("eligibleForProgression") 
    public boolean getEligibleForProgression() { 
		 return this.eligibleForProgression; } 
    public void setEligibleForProgression(boolean eligibleForProgression) { 
		 this.eligibleForProgression = eligibleForProgression; } 
    boolean eligibleForProgression;
    @JsonProperty("enemyMissingPings") 
    public int getEnemyMissingPings() { 
		 return this.enemyMissingPings; } 
    public void setEnemyMissingPings(int enemyMissingPings) { 
		 this.enemyMissingPings = enemyMissingPings; } 
    int enemyMissingPings;
    @JsonProperty("enemyVisionPings") 
    public int getEnemyVisionPings() { 
		 return this.enemyVisionPings; } 
    public void setEnemyVisionPings(int enemyVisionPings) { 
		 this.enemyVisionPings = enemyVisionPings; } 
    int enemyVisionPings;
    @JsonProperty("firstBloodAssist") 
    public boolean getFirstBloodAssist() { 
		 return this.firstBloodAssist; } 
    public void setFirstBloodAssist(boolean firstBloodAssist) { 
		 this.firstBloodAssist = firstBloodAssist; } 
    boolean firstBloodAssist;
    @JsonProperty("firstBloodKill") 
    public boolean getFirstBloodKill() { 
		 return this.firstBloodKill; } 
    public void setFirstBloodKill(boolean firstBloodKill) { 
		 this.firstBloodKill = firstBloodKill; } 
    boolean firstBloodKill;
    @JsonProperty("firstTowerAssist") 
    public boolean getFirstTowerAssist() { 
		 return this.firstTowerAssist; } 
    public void setFirstTowerAssist(boolean firstTowerAssist) { 
		 this.firstTowerAssist = firstTowerAssist; } 
    boolean firstTowerAssist;
    @JsonProperty("firstTowerKill") 
    public boolean getFirstTowerKill() { 
		 return this.firstTowerKill; } 
    public void setFirstTowerKill(boolean firstTowerKill) { 
		 this.firstTowerKill = firstTowerKill; } 
    boolean firstTowerKill;
    @JsonProperty("gameEndedInEarlySurrender") 
    public boolean getGameEndedInEarlySurrender() { 
		 return this.gameEndedInEarlySurrender; } 
    public void setGameEndedInEarlySurrender(boolean gameEndedInEarlySurrender) { 
		 this.gameEndedInEarlySurrender = gameEndedInEarlySurrender; } 
    boolean gameEndedInEarlySurrender;
    @JsonProperty("gameEndedInSurrender") 
    public boolean getGameEndedInSurrender() { 
		 return this.gameEndedInSurrender; } 
    public void setGameEndedInSurrender(boolean gameEndedInSurrender) { 
		 this.gameEndedInSurrender = gameEndedInSurrender; } 
    boolean gameEndedInSurrender;
    @JsonProperty("getBackPings") 
    public int getGetBackPings() { 
		 return this.getBackPings; } 
    public void setGetBackPings(int getBackPings) { 
		 this.getBackPings = getBackPings; } 
    int getBackPings;
    @JsonProperty("goldEarned") 
    public int getGoldEarned() { 
		 return this.goldEarned; } 
    public void setGoldEarned(int goldEarned) { 
		 this.goldEarned = goldEarned; } 
    int goldEarned;
    @JsonProperty("goldSpent") 
    public int getGoldSpent() { 
		 return this.goldSpent; } 
    public void setGoldSpent(int goldSpent) { 
		 this.goldSpent = goldSpent; } 
    int goldSpent;
    @JsonProperty("holdPings") 
    public int getHoldPings() { 
		 return this.holdPings; } 
    public void setHoldPings(int holdPings) { 
		 this.holdPings = holdPings; } 
    int holdPings;
    @JsonProperty("individualPosition") 
    public String getIndividualPosition() { 
		 return this.individualPosition; } 
    public void setIndividualPosition(String individualPosition) { 
		 this.individualPosition = individualPosition; } 
    String individualPosition;
    @JsonProperty("inhibitorKills") 
    public int getInhibitorKills() { 
		 return this.inhibitorKills; } 
    public void setInhibitorKills(int inhibitorKills) { 
		 this.inhibitorKills = inhibitorKills; } 
    int inhibitorKills;
    @JsonProperty("inhibitorTakedowns") 
    public int getInhibitorTakedowns() { 
		 return this.inhibitorTakedowns; } 
    public void setInhibitorTakedowns(int inhibitorTakedowns) { 
		 this.inhibitorTakedowns = inhibitorTakedowns; } 
    int inhibitorTakedowns;
    @JsonProperty("inhibitorsLost") 
    public int getInhibitorsLost() { 
		 return this.inhibitorsLost; } 
    public void setInhibitorsLost(int inhibitorsLost) { 
		 this.inhibitorsLost = inhibitorsLost; } 
    int inhibitorsLost;
    @JsonProperty("item0") 
    public int getItem0() { 
		 return this.item0; } 
    public void setItem0(int item0) { 
		 this.item0 = item0; } 
    int item0;
    @JsonProperty("item1") 
    public int getItem1() { 
		 return this.item1; } 
    public void setItem1(int item1) { 
		 this.item1 = item1; } 
    int item1;
    @JsonProperty("item2") 
    public int getItem2() { 
		 return this.item2; } 
    public void setItem2(int item2) { 
		 this.item2 = item2; } 
    int item2;
    @JsonProperty("item3") 
    public int getItem3() { 
		 return this.item3; } 
    public void setItem3(int item3) { 
		 this.item3 = item3; } 
    int item3;
    @JsonProperty("item4") 
    public int getItem4() { 
		 return this.item4; } 
    public void setItem4(int item4) { 
		 this.item4 = item4; } 
    int item4;
    @JsonProperty("item5") 
    public int getItem5() { 
		 return this.item5; } 
    public void setItem5(int item5) { 
		 this.item5 = item5; } 
    int item5;
    @JsonProperty("item6") 
    public int getItem6() { 
		 return this.item6; } 
    public void setItem6(int item6) { 
		 this.item6 = item6; } 
    int item6;
    @JsonProperty("itemsPurchased") 
    public int getItemsPurchased() { 
		 return this.itemsPurchased; } 
    public void setItemsPurchased(int itemsPurchased) { 
		 this.itemsPurchased = itemsPurchased; } 
    int itemsPurchased;
    @JsonProperty("killingSprees") 
    public int getKillingSprees() { 
		 return this.killingSprees; } 
    public void setKillingSprees(int killingSprees) { 
		 this.killingSprees = killingSprees; } 
    int killingSprees;
    @JsonProperty("kills") 
    public int getKills() { 
		 return this.kills; } 
    public void setKills(int kills) { 
		 this.kills = kills; } 
    int kills;
    @JsonProperty("lane") 
    public String getLane() { 
		 return this.lane; } 
    public void setLane(String lane) { 
		 this.lane = lane; } 
    String lane;
    @JsonProperty("largestCriticalStrike") 
    public int getLargestCriticalStrike() { 
		 return this.largestCriticalStrike; } 
    public void setLargestCriticalStrike(int largestCriticalStrike) { 
		 this.largestCriticalStrike = largestCriticalStrike; } 
    int largestCriticalStrike;
    @JsonProperty("largestKillingSpree") 
    public int getLargestKillingSpree() { 
		 return this.largestKillingSpree; } 
    public void setLargestKillingSpree(int largestKillingSpree) { 
		 this.largestKillingSpree = largestKillingSpree; } 
    int largestKillingSpree;
    @JsonProperty("largestMultiKill") 
    public int getLargestMultiKill() { 
		 return this.largestMultiKill; } 
    public void setLargestMultiKill(int largestMultiKill) { 
		 this.largestMultiKill = largestMultiKill; } 
    int largestMultiKill;
    @JsonProperty("longestTimeSpentLiving") 
    public int getLongestTimeSpentLiving() { 
		 return this.longestTimeSpentLiving; } 
    public void setLongestTimeSpentLiving(int longestTimeSpentLiving) { 
		 this.longestTimeSpentLiving = longestTimeSpentLiving; } 
    int longestTimeSpentLiving;
    @JsonProperty("magicDamageDealt") 
    public int getMagicDamageDealt() { 
		 return this.magicDamageDealt; } 
    public void setMagicDamageDealt(int magicDamageDealt) { 
		 this.magicDamageDealt = magicDamageDealt; } 
    int magicDamageDealt;
    @JsonProperty("magicDamageDealtToChampions") 
    public int getMagicDamageDealtToChampions() { 
		 return this.magicDamageDealtToChampions; } 
    public void setMagicDamageDealtToChampions(int magicDamageDealtToChampions) { 
		 this.magicDamageDealtToChampions = magicDamageDealtToChampions; } 
    int magicDamageDealtToChampions;
    @JsonProperty("magicDamageTaken") 
    public int getMagicDamageTaken() { 
		 return this.magicDamageTaken; } 
    public void setMagicDamageTaken(int magicDamageTaken) { 
		 this.magicDamageTaken = magicDamageTaken; } 
    int magicDamageTaken;
    @JsonProperty("missions") 
    public Missions getMissions() {
		 return this.missions; } 
    public void setMissions(Missions missions) {
		 this.missions = missions; } 
    Missions missions;
    @JsonProperty("needVisionPings") 
    public int getNeedVisionPings() { 
		 return this.needVisionPings; } 
    public void setNeedVisionPings(int needVisionPings) { 
		 this.needVisionPings = needVisionPings; } 
    int needVisionPings;
    @JsonProperty("neutralMinionsKilled") 
    public int getNeutralMinionsKilled() { 
		 return this.neutralMinionsKilled; } 
    public void setNeutralMinionsKilled(int neutralMinionsKilled) { 
		 this.neutralMinionsKilled = neutralMinionsKilled; } 
    int neutralMinionsKilled;
    @JsonProperty("nexusKills") 
    public int getNexusKills() { 
		 return this.nexusKills; } 
    public void setNexusKills(int nexusKills) { 
		 this.nexusKills = nexusKills; } 
    int nexusKills;
    @JsonProperty("nexusLost") 
    public int getNexusLost() { 
		 return this.nexusLost; } 
    public void setNexusLost(int nexusLost) { 
		 this.nexusLost = nexusLost; } 
    int nexusLost;
    @JsonProperty("nexusTakedowns") 
    public int getNexusTakedowns() { 
		 return this.nexusTakedowns; } 
    public void setNexusTakedowns(int nexusTakedowns) { 
		 this.nexusTakedowns = nexusTakedowns; } 
    int nexusTakedowns;
    @JsonProperty("objectivesStolen") 
    public int getObjectivesStolen() { 
		 return this.objectivesStolen; } 
    public void setObjectivesStolen(int objectivesStolen) { 
		 this.objectivesStolen = objectivesStolen; } 
    int objectivesStolen;
    @JsonProperty("objectivesStolenAssists") 
    public int getObjectivesStolenAssists() { 
		 return this.objectivesStolenAssists; } 
    public void setObjectivesStolenAssists(int objectivesStolenAssists) { 
		 this.objectivesStolenAssists = objectivesStolenAssists; } 
    int objectivesStolenAssists;
    @JsonProperty("onMyWayPings") 
    public int getOnMyWayPings() { 
		 return this.onMyWayPings; } 
    public void setOnMyWayPings(int onMyWayPings) { 
		 this.onMyWayPings = onMyWayPings; } 
    int onMyWayPings;
    @JsonProperty("participantId") 
    public int getParticipantId() { 
		 return this.participantId; } 
    public void setParticipantId(int participantId) { 
		 this.participantId = participantId; } 
    int participantId;
    @JsonProperty("pentaKills") 
    public int getPentaKills() { 
		 return this.pentaKills; } 
    public void setPentaKills(int pentaKills) { 
		 this.pentaKills = pentaKills; } 
    int pentaKills;
    @JsonProperty("perks") 
    public Perks getPerks() {
		 return this.perks; } 
    public void setPerks(Perks perks) {
		 this.perks = perks; } 
    Perks perks;
    @JsonProperty("physicalDamageDealt") 
    public int getPhysicalDamageDealt() { 
		 return this.physicalDamageDealt; } 
    public void setPhysicalDamageDealt(int physicalDamageDealt) { 
		 this.physicalDamageDealt = physicalDamageDealt; } 
    int physicalDamageDealt;
    @JsonProperty("physicalDamageDealtToChampions") 
    public int getPhysicalDamageDealtToChampions() { 
		 return this.physicalDamageDealtToChampions; } 
    public void setPhysicalDamageDealtToChampions(int physicalDamageDealtToChampions) { 
		 this.physicalDamageDealtToChampions = physicalDamageDealtToChampions; } 
    int physicalDamageDealtToChampions;
    @JsonProperty("physicalDamageTaken") 
    public int getPhysicalDamageTaken() { 
		 return this.physicalDamageTaken; } 
    public void setPhysicalDamageTaken(int physicalDamageTaken) { 
		 this.physicalDamageTaken = physicalDamageTaken; } 
    int physicalDamageTaken;
    @JsonProperty("placement") 
    public int getPlacement() { 
		 return this.placement; } 
    public void setPlacement(int placement) { 
		 this.placement = placement; } 
    int placement;
    @JsonProperty("playerAugment1") 
    public int getPlayerAugment1() { 
		 return this.playerAugment1; } 
    public void setPlayerAugment1(int playerAugment1) { 
		 this.playerAugment1 = playerAugment1; } 
    int playerAugment1;
    @JsonProperty("playerAugment2") 
    public int getPlayerAugment2() { 
		 return this.playerAugment2; } 
    public void setPlayerAugment2(int playerAugment2) { 
		 this.playerAugment2 = playerAugment2; } 
    int playerAugment2;
    @JsonProperty("playerAugment3") 
    public int getPlayerAugment3() { 
		 return this.playerAugment3; } 
    public void setPlayerAugment3(int playerAugment3) { 
		 this.playerAugment3 = playerAugment3; } 
    int playerAugment3;
    @JsonProperty("playerAugment4") 
    public int getPlayerAugment4() { 
		 return this.playerAugment4; } 
    public void setPlayerAugment4(int playerAugment4) { 
		 this.playerAugment4 = playerAugment4; } 
    int playerAugment4;
    @JsonProperty("playerScore0") 
    public int getPlayerScore0() { 
		 return this.playerScore0; } 
    public void setPlayerScore0(int playerScore0) { 
		 this.playerScore0 = playerScore0; } 
    int playerScore0;
    @JsonProperty("playerScore1") 
    public int getPlayerScore1() { 
		 return this.playerScore1; } 
    public void setPlayerScore1(int playerScore1) { 
		 this.playerScore1 = playerScore1; } 
    int playerScore1;
    @JsonProperty("playerScore10") 
    public int getPlayerScore10() { 
		 return this.playerScore10; } 
    public void setPlayerScore10(int playerScore10) { 
		 this.playerScore10 = playerScore10; } 
    int playerScore10;
    @JsonProperty("playerScore11") 
    public int getPlayerScore11() { 
		 return this.playerScore11; } 
    public void setPlayerScore11(int playerScore11) { 
		 this.playerScore11 = playerScore11; } 
    int playerScore11;
    @JsonProperty("playerScore2") 
    public int getPlayerScore2() { 
		 return this.playerScore2; } 
    public void setPlayerScore2(int playerScore2) { 
		 this.playerScore2 = playerScore2; } 
    int playerScore2;
    @JsonProperty("playerScore3") 
    public int getPlayerScore3() { 
		 return this.playerScore3; } 
    public void setPlayerScore3(int playerScore3) { 
		 this.playerScore3 = playerScore3; } 
    int playerScore3;
    @JsonProperty("playerScore4") 
    public int getPlayerScore4() { 
		 return this.playerScore4; } 
    public void setPlayerScore4(int playerScore4) { 
		 this.playerScore4 = playerScore4; } 
    int playerScore4;
    @JsonProperty("playerScore5") 
    public int getPlayerScore5() { 
		 return this.playerScore5; } 
    public void setPlayerScore5(int playerScore5) { 
		 this.playerScore5 = playerScore5; } 
    int playerScore5;
    @JsonProperty("playerScore6") 
    public int getPlayerScore6() { 
		 return this.playerScore6; } 
    public void setPlayerScore6(int playerScore6) { 
		 this.playerScore6 = playerScore6; } 
    int playerScore6;
    @JsonProperty("playerScore7") 
    public int getPlayerScore7() { 
		 return this.playerScore7; } 
    public void setPlayerScore7(int playerScore7) { 
		 this.playerScore7 = playerScore7; } 
    int playerScore7;
    @JsonProperty("playerScore8") 
    public int getPlayerScore8() { 
		 return this.playerScore8; } 
    public void setPlayerScore8(int playerScore8) { 
		 this.playerScore8 = playerScore8; } 
    int playerScore8;
    @JsonProperty("playerScore9") 
    public int getPlayerScore9() { 
		 return this.playerScore9; } 
    public void setPlayerScore9(int playerScore9) { 
		 this.playerScore9 = playerScore9; } 
    int playerScore9;
    @JsonProperty("playerSubteamId") 
    public int getPlayerSubteamId() { 
		 return this.playerSubteamId; } 
    public void setPlayerSubteamId(int playerSubteamId) { 
		 this.playerSubteamId = playerSubteamId; } 
    int playerSubteamId;
    @JsonProperty("profileIcon") 
    public int getProfileIcon() { 
		 return this.profileIcon; } 
    public void setProfileIcon(int profileIcon) { 
		 this.profileIcon = profileIcon; } 
    int profileIcon;
    @JsonProperty("pushPings") 
    public int getPushPings() { 
		 return this.pushPings; } 
    public void setPushPings(int pushPings) { 
		 this.pushPings = pushPings; } 
    int pushPings;
    @JsonProperty("puuid") 
    public String getPuuid() { 
		 return this.puuid; } 
    public void setPuuid(String puuid) { 
		 this.puuid = puuid; } 
    String puuid;
    @JsonProperty("quadraKills") 
    public int getQuadraKills() { 
		 return this.quadraKills; } 
    public void setQuadraKills(int quadraKills) { 
		 this.quadraKills = quadraKills; } 
    int quadraKills;
    @JsonProperty("riotIdGameName") 
    public String getRiotIdGameName() { 
		 return this.riotIdGameName; } 
    public void setRiotIdGameName(String riotIdGameName) { 
		 this.riotIdGameName = riotIdGameName; } 
    String riotIdGameName;
    @JsonProperty("riotIdTagline") 
    public String getRiotIdTagline() { 
		 return this.riotIdTagline; } 
    public void setRiotIdTagline(String riotIdTagline) { 
		 this.riotIdTagline = riotIdTagline; } 
    String riotIdTagline;
    @JsonProperty("role") 
    public String getRole() { 
		 return this.role; } 
    public void setRole(String role) { 
		 this.role = role; } 
    String role;
    @JsonProperty("sightWardsBoughtInGame") 
    public int getSightWardsBoughtInGame() { 
		 return this.sightWardsBoughtInGame; } 
    public void setSightWardsBoughtInGame(int sightWardsBoughtInGame) { 
		 this.sightWardsBoughtInGame = sightWardsBoughtInGame; } 
    int sightWardsBoughtInGame;
    @JsonProperty("spell1Casts") 
    public int getSpell1Casts() { 
		 return this.spell1Casts; } 
    public void setSpell1Casts(int spell1Casts) { 
		 this.spell1Casts = spell1Casts; } 
    int spell1Casts;
    @JsonProperty("spell2Casts") 
    public int getSpell2Casts() { 
		 return this.spell2Casts; } 
    public void setSpell2Casts(int spell2Casts) { 
		 this.spell2Casts = spell2Casts; } 
    int spell2Casts;
    @JsonProperty("spell3Casts") 
    public int getSpell3Casts() { 
		 return this.spell3Casts; } 
    public void setSpell3Casts(int spell3Casts) { 
		 this.spell3Casts = spell3Casts; } 
    int spell3Casts;
    @JsonProperty("spell4Casts") 
    public int getSpell4Casts() { 
		 return this.spell4Casts; } 
    public void setSpell4Casts(int spell4Casts) { 
		 this.spell4Casts = spell4Casts; } 
    int spell4Casts;
    @JsonProperty("subteamPlacement") 
    public int getSubteamPlacement() { 
		 return this.subteamPlacement; } 
    public void setSubteamPlacement(int subteamPlacement) { 
		 this.subteamPlacement = subteamPlacement; } 
    int subteamPlacement;
    @JsonProperty("summoner1Casts") 
    public int getSummoner1Casts() { 
		 return this.summoner1Casts; } 
    public void setSummoner1Casts(int summoner1Casts) { 
		 this.summoner1Casts = summoner1Casts; } 
    int summoner1Casts;
    @JsonProperty("summoner1Id") 
    public int getSummoner1Id() { 
		 return this.summoner1Id; } 
    public void setSummoner1Id(int summoner1Id) { 
		 this.summoner1Id = summoner1Id; } 
    int summoner1Id;
    @JsonProperty("summoner2Casts") 
    public int getSummoner2Casts() { 
		 return this.summoner2Casts; } 
    public void setSummoner2Casts(int summoner2Casts) { 
		 this.summoner2Casts = summoner2Casts; } 
    int summoner2Casts;
    @JsonProperty("summoner2Id") 
    public int getSummoner2Id() { 
		 return this.summoner2Id; } 
    public void setSummoner2Id(int summoner2Id) { 
		 this.summoner2Id = summoner2Id; } 
    int summoner2Id;
    @JsonProperty("summonerId") 
    public String getSummonerId() { 
		 return this.summonerId; } 
    public void setSummonerId(String summonerId) { 
		 this.summonerId = summonerId; } 
    String summonerId;
    @JsonProperty("summonerLevel") 
    public int getSummonerLevel() { 
		 return this.summonerLevel; } 
    public void setSummonerLevel(int summonerLevel) { 
		 this.summonerLevel = summonerLevel; } 
    int summonerLevel;
    @JsonProperty("summonerName") 
    public String getSummonerName() { 
		 return this.summonerName; } 
    public void setSummonerName(String summonerName) { 
		 this.summonerName = summonerName; } 
    String summonerName;
    @JsonProperty("teamEarlySurrendered") 
    public boolean getTeamEarlySurrendered() { 
		 return this.teamEarlySurrendered; } 
    public void setTeamEarlySurrendered(boolean teamEarlySurrendered) { 
		 this.teamEarlySurrendered = teamEarlySurrendered; } 
    boolean teamEarlySurrendered;
    @JsonProperty("teamId") 
    public int getTeamId() { 
		 return this.teamId; } 
    public void setTeamId(int teamId) { 
		 this.teamId = teamId; } 
    int teamId;
    @JsonProperty("teamPosition") 
    public String getTeamPosition() { 
		 return this.teamPosition; } 
    public void setTeamPosition(String teamPosition) { 
		 this.teamPosition = teamPosition; } 
    String teamPosition;
    @JsonProperty("timeCCingOthers") 
    public int getTimeCCingOthers() { 
		 return this.timeCCingOthers; } 
    public void setTimeCCingOthers(int timeCCingOthers) { 
		 this.timeCCingOthers = timeCCingOthers; } 
    int timeCCingOthers;
    @JsonProperty("timePlayed") 
    public int getTimePlayed() { 
		 return this.timePlayed; } 
    public void setTimePlayed(int timePlayed) { 
		 this.timePlayed = timePlayed; } 
    int timePlayed;
    @JsonProperty("totalAllyJungleMinionsKilled") 
    public int getTotalAllyJungleMinionsKilled() { 
		 return this.totalAllyJungleMinionsKilled; } 
    public void setTotalAllyJungleMinionsKilled(int totalAllyJungleMinionsKilled) { 
		 this.totalAllyJungleMinionsKilled = totalAllyJungleMinionsKilled; } 
    int totalAllyJungleMinionsKilled;
    @JsonProperty("totalDamageDealt") 
    public int getTotalDamageDealt() { 
		 return this.totalDamageDealt; } 
    public void setTotalDamageDealt(int totalDamageDealt) { 
		 this.totalDamageDealt = totalDamageDealt; } 
    int totalDamageDealt;
    @JsonProperty("totalDamageDealtToChampions") 
    public int getTotalDamageDealtToChampions() { 
		 return this.totalDamageDealtToChampions; } 
    public void setTotalDamageDealtToChampions(int totalDamageDealtToChampions) { 
		 this.totalDamageDealtToChampions = totalDamageDealtToChampions; } 
    int totalDamageDealtToChampions;
    @JsonProperty("totalDamageShieldedOnTeammates") 
    public int getTotalDamageShieldedOnTeammates() { 
		 return this.totalDamageShieldedOnTeammates; } 
    public void setTotalDamageShieldedOnTeammates(int totalDamageShieldedOnTeammates) { 
		 this.totalDamageShieldedOnTeammates = totalDamageShieldedOnTeammates; } 
    int totalDamageShieldedOnTeammates;
    @JsonProperty("totalDamageTaken") 
    public int getTotalDamageTaken() { 
		 return this.totalDamageTaken; } 
    public void setTotalDamageTaken(int totalDamageTaken) { 
		 this.totalDamageTaken = totalDamageTaken; } 
    int totalDamageTaken;
    @JsonProperty("totalEnemyJungleMinionsKilled") 
    public int getTotalEnemyJungleMinionsKilled() { 
		 return this.totalEnemyJungleMinionsKilled; } 
    public void setTotalEnemyJungleMinionsKilled(int totalEnemyJungleMinionsKilled) { 
		 this.totalEnemyJungleMinionsKilled = totalEnemyJungleMinionsKilled; } 
    int totalEnemyJungleMinionsKilled;
    @JsonProperty("totalHeal") 
    public int getTotalHeal() { 
		 return this.totalHeal; } 
    public void setTotalHeal(int totalHeal) { 
		 this.totalHeal = totalHeal; } 
    int totalHeal;
    @JsonProperty("totalHealsOnTeammates") 
    public int getTotalHealsOnTeammates() { 
		 return this.totalHealsOnTeammates; } 
    public void setTotalHealsOnTeammates(int totalHealsOnTeammates) { 
		 this.totalHealsOnTeammates = totalHealsOnTeammates; } 
    int totalHealsOnTeammates;
    @JsonProperty("totalMinionsKilled") 
    public int getTotalMinionsKilled() { 
		 return this.totalMinionsKilled; } 
    public void setTotalMinionsKilled(int totalMinionsKilled) { 
		 this.totalMinionsKilled = totalMinionsKilled; } 
    int totalMinionsKilled;
    @JsonProperty("totalTimeCCDealt") 
    public int getTotalTimeCCDealt() { 
		 return this.totalTimeCCDealt; } 
    public void setTotalTimeCCDealt(int totalTimeCCDealt) { 
		 this.totalTimeCCDealt = totalTimeCCDealt; } 
    int totalTimeCCDealt;
    @JsonProperty("totalTimeSpentDead") 
    public int getTotalTimeSpentDead() { 
		 return this.totalTimeSpentDead; } 
    public void setTotalTimeSpentDead(int totalTimeSpentDead) { 
		 this.totalTimeSpentDead = totalTimeSpentDead; } 
    int totalTimeSpentDead;
    @JsonProperty("totalUnitsHealed") 
    public int getTotalUnitsHealed() { 
		 return this.totalUnitsHealed; } 
    public void setTotalUnitsHealed(int totalUnitsHealed) { 
		 this.totalUnitsHealed = totalUnitsHealed; } 
    int totalUnitsHealed;
    @JsonProperty("tripleKills") 
    public int getTripleKills() { 
		 return this.tripleKills; } 
    public void setTripleKills(int tripleKills) { 
		 this.tripleKills = tripleKills; } 
    int tripleKills;
    @JsonProperty("trueDamageDealt") 
    public int getTrueDamageDealt() { 
		 return this.trueDamageDealt; } 
    public void setTrueDamageDealt(int trueDamageDealt) { 
		 this.trueDamageDealt = trueDamageDealt; } 
    int trueDamageDealt;
    @JsonProperty("trueDamageDealtToChampions") 
    public int getTrueDamageDealtToChampions() { 
		 return this.trueDamageDealtToChampions; } 
    public void setTrueDamageDealtToChampions(int trueDamageDealtToChampions) { 
		 this.trueDamageDealtToChampions = trueDamageDealtToChampions; } 
    int trueDamageDealtToChampions;
    @JsonProperty("trueDamageTaken") 
    public int getTrueDamageTaken() { 
		 return this.trueDamageTaken; } 
    public void setTrueDamageTaken(int trueDamageTaken) { 
		 this.trueDamageTaken = trueDamageTaken; } 
    int trueDamageTaken;
    @JsonProperty("turretKills") 
    public int getTurretKills() { 
		 return this.turretKills; } 
    public void setTurretKills(int turretKills) { 
		 this.turretKills = turretKills; } 
    int turretKills;
    @JsonProperty("turretTakedowns") 
    public int getTurretTakedowns() { 
		 return this.turretTakedowns; } 
    public void setTurretTakedowns(int turretTakedowns) { 
		 this.turretTakedowns = turretTakedowns; } 
    int turretTakedowns;
    @JsonProperty("turretsLost") 
    public int getTurretsLost() { 
		 return this.turretsLost; } 
    public void setTurretsLost(int turretsLost) { 
		 this.turretsLost = turretsLost; } 
    int turretsLost;
    @JsonProperty("unrealKills") 
    public int getUnrealKills() { 
		 return this.unrealKills; } 
    public void setUnrealKills(int unrealKills) { 
		 this.unrealKills = unrealKills; } 
    int unrealKills;
    @JsonProperty("visionClearedPings") 
    public int getVisionClearedPings() { 
		 return this.visionClearedPings; } 
    public void setVisionClearedPings(int visionClearedPings) { 
		 this.visionClearedPings = visionClearedPings; } 
    int visionClearedPings;
    @JsonProperty("visionScore") 
    public int getVisionScore() { 
		 return this.visionScore; } 
    public void setVisionScore(int visionScore) { 
		 this.visionScore = visionScore; } 
    int visionScore;
    @JsonProperty("visionWardsBoughtInGame") 
    public int getVisionWardsBoughtInGame() { 
		 return this.visionWardsBoughtInGame; } 
    public void setVisionWardsBoughtInGame(int visionWardsBoughtInGame) { 
		 this.visionWardsBoughtInGame = visionWardsBoughtInGame; } 
    int visionWardsBoughtInGame;
    @JsonProperty("wardsKilled") 
    public int getWardsKilled() { 
		 return this.wardsKilled; } 
    public void setWardsKilled(int wardsKilled) { 
		 this.wardsKilled = wardsKilled; } 
    int wardsKilled;
    @JsonProperty("wardsPlaced") 
    public int getWardsPlaced() { 
		 return this.wardsPlaced; } 
    public void setWardsPlaced(int wardsPlaced) { 
		 this.wardsPlaced = wardsPlaced; } 
    int wardsPlaced;
    @JsonProperty("win") 
    public boolean getWin() { 
		 return this.win; } 
    public void setWin(boolean win) { 
		 this.win = win; } 
    boolean win;
}
