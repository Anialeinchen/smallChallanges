/*
*	@param talking if the parrot is talking == true
*	@param hour 0..23
*/
public boolean parrotTrouble(boolean talking, int hour) {
  if((talking == true)&&((hour<7)||(hour>20)))
    return true;
  else
    return false;
}