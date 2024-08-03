# lib_mgmt_sys
This is our repo to collaborate for code commits
Install git for windows or linux whichever OS you use for your dev environment

git config --global user.email <your_email>@gmail.com
git config --global user.name <your name>

To use the repo please follow the steps:
1. clone the repo
   git clone https://github.com/kkmallela/lib_mgmt_sys.git
2. cd lib_mgmt_sys
3. git branch -a   to list all remote branches
4. git checkout <your feature branch name>
   ex: git checkout feature_krishna
   
6. always update your feature branch with main branch code before you start new work
   steps:
   1. go to main branch - git checkout main
   2. git pull
   3. switch to your branch - git checkout feature_<your name>  (this is your local branch on your system)
   4. git merge main  (you will have your chagnes if any all changes from main branch into your branch)
   5. If there is a conflict you need to resolve and identify changes that are required
   6. git commit to your feature branch (here you only committed to your local branch in your sytem)
   7. git push (to push to your changes to the asociated remote branch on the server)

7. To merge your changes to main branch you need to raise a pull request from the ui or cli 

