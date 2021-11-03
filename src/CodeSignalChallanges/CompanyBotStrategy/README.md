## [Company Bot Strategy](https://app.codesignal.com/challenge/6jzS7zy9SkDyufdBx)

Each CodeSignal Company Bot is trained by engineers from that specific company. The way it works is that a representative group of engineers from each company is identified as trainers before the bot goes live, and they CodeFight against the bot during a training phase. The current training algorithm is definitely more complex, but let's assume it works this way:

For each trainer we collect two pieces of information per task [answerTime, correctness], where correctness is 1 if the answer was correct, -1 if the answer was wrong, and 0 if no answer was given. In this case, the bot's correct answer time for a given task would be the average of the answer times from the trainers who answered correctly. Given all of the training information for a specific task, calculate the bot's answer time.

### Example
1. trainingData = [ [3, 1], [6, 1], [4, 1], [5, 1] ]

   1. the output should be companyBotStrategy(trainingData) = 4.5. 
   2. All four trainers have solved the task correctly, so the answer is (3 + 6 + 4 + 5) / 4 = 4.5.
2. trainingData = [ [4, 1], [4, -1], [0, 0], [6, 1] ]

the output should be companyBotStrategy(trainingData) = 5.0.

Only the 1st and the 4th trainers (1-based) submitted correct solutions, so the answer is (4 + 6) / 2 = 5.0.

3. trainingData = [ [4, -1], [0, 0], [5, -1] ]

the output should be companyBotStrategy(trainingData) = 0.0.  <br/> No correct answers were given for the task.

### Input/Output
- ##### [execution time limit] 3 seconds (java)
- ##### [input] array.array.integer trainingData

- The ith element of trainingData contains exactly 2 elements: trainingData[i][0] is the answer time for the ith person and trainingData[i][1] is correctness. 
  - If a trainer answered correctly, then correctness equals 1; 
  - If a trainer answered incorrectly, then correctness equals -1;
  - If a trainer didn't give any answer, answerTime and correctness both equal to 0.
  
  Guaranteed constraints:
  1 ≤ trainingData.length ≤ 20, <br/>
  trainingData[i].length = 2, <br/>
  0 ≤ trainingData[i][0] ≤ 10, <br/>
  -1 ≤ trainingData[i][1] ≤ 1. <br/>