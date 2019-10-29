package examples;

import java.util.*;
public class testGrade {
    
	
	public static void main( String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	double playerStats[] = new double [96];
    
    
    System.out.print("Please input the quarterback's passing attempts: ");
    playerStats[1] = scanner.nextDouble();
    System.out.print("Please input the quarterback's completions: ");
    playerStats[0] = scanner.nextDouble();
    System.out.print("Please input the quarterback's passing yards: ");
    playerStats[4] = scanner.nextDouble();
    System.out.print("Please input the quarterback's passing touchdowns: ");
    playerStats[6] = scanner.nextDouble();
    System.out.print("Please input the quarterback's interceptions: ");
    playerStats[7] = scanner.nextDouble();
    
    
    
    
    playerStats[10] = passerRatingPro(playerStats[0], playerStats[1], playerStats[4], playerStats[6], playerStats[7]);
    playerStats[3] = calculatePercentage(playerStats[0], playerStats[1]);
    
    
    System.out.println(" The quarterback's statline was " + playerStats[0] + "/" + playerStats[1] + " for " + playerStats[4] + " yds " + 
                        playerStats[6] + " TD " + playerStats[7] + " INT for a " + playerStats[3] + "% and a passer rating of " +  playerStats[10]);
    
    
    
	
}
		public static double passerRatingPro(double comp, double att, double yds, double tds, double ints) {
            
            double QBRT = 0;
            
            QBRT = (((((comp/att) - 0.3) * 5 + ((yds/att) - 3) * 0.25 + (tds/att) * 20 + 2.375 - ((ints/att) * 25)) / 6) * 100);
            
            return QBRT;
            
        }
        public static double calculatePercentage(double num, double den) {
            
           double quot = 0;
           
           quot = ((num / den) * 100);
           
           return quot;
            
        }
        
}
	
			/*
            
            0. Pass Completions
            1. Pass Attempts
            3. Completion Percentage
            4. Passing Yards
            5. Yards per attempt
            6. Passing Touchdowns
            7. Passing Interceptions
            8. Sacked
            9. Sack Yards
            10. Pro League Passer Rating
            11. College League Passer Rating
            12. Rush Attempts
            13. Rush Yards
            14. Yards per Attempt
            15. Rushing Touchdowns
            16. Fumbles
            17. Longest Run
            18. Longest Pass
            19. Receptions
            20. Targets
            21. Catch Percentage
            22. Drops
            23. Drop Percentage
            24. Receiving Yards
            25. Yards per catch
            26. receiving Touchdowns
            27. Longest catch
            28. Yards after catch
            29. average RAC
            30. 20+ yard runs
            31. 20+ yard catch
            32. 40+ yard runs
            33. 40+ yard catches
            34. Tackles(Total)
            35. Tackles (Assisted)
            36. Tackles(Solo)
            37. Tackles(For Loss)
            38. Sacks
            39. Forced Fumble
            40. Fumbles recovered
            41. Safeties forced
            42. Pass Deflections
            43. Receptions allowed
            44. Receiving yards allowed
            45. Pro Passer Rating against
            46. College Passer Rating against
            47. Caught Interceptions
            48. Defensive touchdowns
            49. Interception yards
            50. Field Goals attempted
            51. Field Goals Made
            52. Field Goal under 30 attempts
            53. Field Goal under 30 made
            54. Field Goal 30-39 attempts
            55. Field Goal 30-39 made
            56. Field Goal 40-49 attempts
            57. Field Goal 40-49 made
            58. Field Goal 50+ attempts
            59. Field Goal 50+ made
            60. Longest Field Goal
            61. Kickoffs
            62. Touchbacks
            63. Touchback Percentage
            64. Average field position
            65. missed tackles
            66. Punts
            67. Punt yards
            68. NET Punt Yards
            69. Inside 10
            70. Longest punt
            71. Punt returns
            72. Punt Return yards
            73. Punt return average
            74. Longest punt return
            75. punt return touchdowns
            76. Kick returns
            77. Kick return Yards
            78. Kick return average
            79. Kick return touchdowns
            80. Kick return longest
            81. total return touchdowns
            82. all-purpose yards
            83. all-purpose touchdowns
            84. points
            85. games played
            86. games started
            87. weeks injured
            88. injuries
            89. pancakes
            90. sacks allowed
            91. drop backs
            92. penalties
            93. pentaly yards
            94. Hurried(Passes)
            95. Hurried(Defense)
   
            
            
            
            
            */