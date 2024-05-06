# CSC 340 Summer 2024 Individual Assignment 1
> First collaborative homework assignment.

This assignment is to make sure you are comfortable using Git. At the end, you will have created your own branch off of a main branch, made your own edits, pushed those edits back to the origin. \
You will have sent a pull request to have your changes merged with the main branch. If you have already given me your GitHub username, 
You will receive an invitation to participate in the project via email once I have added you as a collaborator to the GitHub repo. That's when you know you will have permission to push your changes to the GitHub server.

## Step One: In your OneDrive location, navigate to your workspace for CSC340 projects. 
Do not go into any previously created repositories!

## Step Two: Right-Click on an empty space and start a Git Bash terminal/Git GUI dialog. 
> MacOS users can just start a regular terminal.

## Step Three: Clone this repository to your local machine.
    git clone https://github.com/uncg-csc340/su24-individual-hw1.git

## Step Four: Change directory into the the repository you just cloned. 
    cd su24-individual-hw1
> Look for the blue text that says (main)/(master). This shows that you are in a git repository.

## Step Five: Create your own branch.
    git checkout -b [ BRANCH NAME ]
> where [ BRANCH NAME ] is your first initial and last name, e.g. John Doe would be jdoe, mine is sntini.

## Step Six: Open the project folder in IntelliJ.
> In the main class, make your edits by changing appendText to an intro paragraph about yourself. Do not directly edit the about-me.txt file.
> Add a blank line. Add your name on a new line and underline it using dashes. Then write a short paragraph about yourself.
> 
> Save your changes and run the main method once, and this will append your text in the file.
>
> If you run it multiple times, it will append your text multiple times. We don't want that.
> 
> Note: This file is public. Do not add any information that you would not want someone to read who might happen upon it.
>
> Save your changes.

## Step Seven: In GitBash, add the edited file to the staging area.
    git add about-me.txt
    
## Step Eight: In GitBash, commit your changes to the repository.
    git commit -m 'a short description of why you are making this commit'

## Step Nine: In GitBash, pull from the main branch into your branch.
>More edits may have been to the document from other users in the time it took you to clone the file and update it.
>
>To resolve any potential conflicts and make sure your document is up-to-date, pull from Main again.
    git pull origin main

> Note, if there are any updates or merge conflicts that have to be resolved, Go to Step six. Edit the file and remove the extra text inserted by the merge conflict.
> 
> The file with conflicts will include two versions of the same lines. Each version will be labeled with branch names. When you resolve the conflicts, make sure you do
> not erase someone else's work in about-me.txt. 

## Step Ten: In GitBash, publish your branch to origin.
    git push origin [ BRANCH NAME ]

## Step Eleven: Log into GitHub, go to the repo, and create a Pull Request.
https://github.com/uncg-csc340/su24-individual-hw1
> GitHub will probably prompt you to create a pull request by saying "Compare And Pull Request"
> 
> Make sure the compare branch is your own branch, and the base branch is main.

## Final Step: Submit a link to the pull request that you created.
> Your work will get approved and merged so that your changes show up on the main branch.
