import java.util.*; package exercice; public class Exercice { public static List<String> solution(String str, List<Character> ordre) { Map<Character, Integer> jmb = new HashMap<>(); int hjkblhugfjiouerihjbkfhguiouldhfmir = 0; for (char c : ordre) { jmb.put(c, hjkblhugfjiouerihjbkfhguiouldhfmir); hjkblhugfjiouerihjbkfhguiouldhfmir++; } List<String> azertyuiopqsdfghjklmwxcvbn = new ArrayList<>(); StringBuilder aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA = new StringBuilder(); for (char c : str.toCharArray()) { if (Character.isLetter(c) || Character.isDigit(c)) { aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.append(c); } else { if (aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.length() > 0) { azertyuiopqsdfghjklmwxcvbn.add(aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.toString()); aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.setLength(0); } } } if (aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.length() > 0) { azertyuiopqsdfghjklmwxcvbn.add(aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.toString()); } azertyuiopqsdfghjklmwxcvbn.sort((a, b) -> { char bBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB = Character.toLowerCase(a.charAt(0)); char cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC = Character.toLowerCase(b.charAt(0)); int bLBLBLBLBLBLBLBLBLBLBLBLBLBLBLBLBLBL = jmb.getOrDefault(bBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB, Integer.MAX_VALUE); int gLALALALALALALALALALALALALA = jmb.getOrDefault(cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC, Integer.MAX_VALUE); if (bLBLBLBLBLBLBLBLBLBLBLBLBLBLBLBLBLBL == gLALALALALALALALALALALALALA) { return a.compareToIgnoreCase(b); } return Integer.compare(bLBLBLBLBLBLBLBLBLBLBLBLBLBLBLBLBLBL, gLALALALALALALALALALALALALA); }); return azertyuiopqsdfghjklmwxcvbn; } }