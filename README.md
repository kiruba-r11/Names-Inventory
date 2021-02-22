# Names-Inventory
A simple app using ListView to display a list of names.

## How to get started?
You can refer to the following articles on the basics of Git and GitHub, in case you are stuck:

- [Forking a Repo](https://help.github.com/en/github/getting-started-with-github/fork-a-repo)
- [Cloning a Repo](https://help.github.com/en/desktop/contributing-to-projects/creating-a-pull-request)
- [How to create a Pull Request](https://opensource.com/article/19/7/create-pull-request-github)

## Steps to follow :scroll:

### 1. Fork it :fork_and_knife:

You can get your own fork/copy of [Names-Inventory](https://github.com/kiruba-r11/Names-Inventory) by using the <kbd><b>Fork</b></kbd> button.

### 2. Clone it :busts_in_silhouette:

You need to clone (download) it to local machine using

```sh
$ git clone https://github.com/Your_Username/Names-Inventory.git
```

> This makes a local copy of repository in your machine.

### 3. Set it up :arrow_up:

Run the following commands to see that *your local copy* has a reference to *your forked remote repository* in GitHub :octocat:

```sh
$ git remote -v
origin  https://github.com/Your_Username/Names-Inventory.git (fetch)
origin  https://github.com/Your_Username/Names-Inventory.git (push)
```
Now, lets add a reference to the original [Names-Inventory](https://github.com/kiruba-r11/Names-Inventory) repository using

```sh
$ git remote add upstream https://github.com/kiruba-r11/Names-Inventory.git
```

> This adds a new remote named ***upstream***.

See the changes using

```sh
$ git remote -v
origin  https://github.com/Your_Username/Names-Inventory.git (fetch)
origin  https://github.com/Your_Username/Names-Inventory.git (push)
upstream  https://github.com/kiruba-r11/Names-Inventory.git (fetch)
upstream  https://github.com/kiruba-r11/Names-Inventory.git (push)
```

### 4. Sync it :recycle:

Always keep your local copy of repository updated with the original repository.
Before making any changes and/or in an appropriate interval, run the following commands *carefully* to update your local repository.

```sh
# Fetch all remote repositories and delete any deleted remote branches
$ git fetch --all --prune

# Switch to `main` branch
$ git checkout main

# Reset local `main` branch to match `upstream` repository's `main` branch
$ git reset --hard upstream/main

# Push changes to your forked `Names-Inventory` repo
$ git push origin main
```

### 5. Ready Steady Go... :turtle: :rabbit2:

Once you have completed these steps, you are ready to start contributing.

### 6. Create a new branch :bangbang:

Whenever you are going to make contribution. Please create seperate branch using command and keep your `main` branch clean (i.e. synced with remote branch).

```sh
# It will create a new branch with name Branch_Name and switch to that branch
$ git checkout -b Branch_Name
```

> This will switch to the Branch_Name branch

To add the changes to the branch. Use

```sh
# To add all files to branch Branch_Name
$ git add .
```

Type in a message relevant for the code reveiwer using

```sh
# This message get associated with all files you have changed
$ git commit -m 'relevant message'
```

### 7. Share your work :star_struck:

Now, Push your awesome work (create a new text file with your full name) to your remote repository using

```sh
# To push your work to your remote repository
$ git push -u origin Branch_Name
```

Then, go to your repository in browser and click on `compare and pull requests`.
Then add a title and description to your pull request.
