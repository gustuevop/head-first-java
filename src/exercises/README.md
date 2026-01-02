# Description
The authors present a real Java application in the book that generates random hotshot-style phrases.

## What I found
While running this application, I noticed some repetitive patterns. As a result, I wanted to build a system that monitors the generation process and prevents repetition by ranking words based on how often they appear and then reducing the probability of selecting the same word again.

I think that trying to precisely control the probability percentages would be difficult, so I considered saving the most recently generated phrases or words and checking them before presenting a new one.