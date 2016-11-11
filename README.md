# Bowling-Game
Simple Bowling Game

The features on the system are:

1 .One player only

2 .In each frame, the bowler has 2 tries to knock down all the pins

      -If in 2 tries, the bowler fails to knock down all the pins, their score is the sum of the number of pins they've knocked down in the 2 attempts
      E.g, if a bowler rolls, 4,4, then their score is 8.
      
      -If in 2 tries, the bowler knocks down all the pins, it is a spare. The scoring of a spare is the sum of the number of pins knocked down plus the number of pins knocked down in the next bowl.
      E.g, if a bowler rolls, 4,6 | 5,0, then their score is 20 = (4 + 6 + 5) + (5 + 0).
      
      -If in one try, the bowler knocks down all the pins, it is a strike. The scoring of a strike is the sum of the number of pins knocked down plus the number of pins knocked down in the next two bowls.
      E.g, if a bowler rolls, 10 | 5, 4, then their score is 28 = (10 + 5 + 4) + (5 + 4).
      
3.There are 10 pins in a frame

4.There are 10 frames in a match


Java is used to implement this bowling game .
