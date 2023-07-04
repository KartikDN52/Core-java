public class Valorant {
   //States
    public String agentName;
    public String mapName;
    public float kd;
    public boolean isAFK;
    public String agentSignatureAbility;
    public String agentType;
    public String agentAbilityName;
    public String userName;
    public String inGameName;
    public String mapType;
    public String userTag;
    public String skinName;
    public int numberOfUltimateOrbPoint;
    public String ultimateAbilityName;
    public float dpi;
    public int fps;
	public int matchTimeinMin;
    public String matchModes;
    public boolean isUpdated;
    public boolean isTeammateAlive;

    // Constructor
    public Valorant(String agentName, String agentType, String agentSignatureAbility,String mapName, String mapType,String userTag,boolean isAFK) {
        this.agentName = agentName;
        this.agentType = agentType;
        this.agentSignatureAbility = agentSignatureAbility;
        this.mapName = mapName;
        this.mapType = mapType;
        this.userTag = userTag;
        this.isAFK = isAFK;
    }

    // Behaviours
    public void signin() {
    }

    public void checkUpdate() {
    }

    public void getDailyMission() {
    }

    public void inGameStore() {
    }

    public void paymentMethods() {
    }
	
	public void matchModes(){
	}
	
    public void unlockAgent() {
    }

    public void matchServers() {
    }

    public void getMatchInfo() {
    }

    public void signout() {
    }

    public static void main(String[] args) {
        Valorant match = new Valorant("Jett", "Duelist ", "Tailwind", "Spilt", "defending","#0016",false );
		System.out.println(match);
		System.out.println(match.agentName);
		System.out.println(match.agentType);
		System.out.println(match.agentSignatureAbility);
		System.out.println(match.mapName);
		System.out.println(match.mapType);
		System.out.println(match.userTag);
        System.out.println(match.isAFK);
    }
}
