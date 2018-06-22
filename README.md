This is Tianhua Z.
I've changed this line. common use cases for git

1. create a new branch
 - when to create a new branch?
 	* working on a new feature
 		```git checkout -b new-feature```
 - when you might not need a new branch?
 	* fixing a typo
 	* editing README, documentation
2. commit and push

 - always pull before creating a branch
 - when you are done with your work, commit ```git commit -am "Commit message"```

 	1) everything goes well - nothing to do, commit and push

 	2) conflict - two ways to resolve
 		1. merge, with git pull origin master

```
 		A---B---C topic
         /
    D---E---F---G master
```


```
	  A---B---C topic
	 /         \
    D---E---F---G---H master
```



- 		2. rebase, with git pull --rebase origin master
		difference btw merge and rebase




```
          A---B---C topic
         /
    D---E---F---G master
```


```
                  A'--B'--C' topic
                 /
    D---E---F---G master
```

3. other useful tricks
  - git stash
  - git stash pop
