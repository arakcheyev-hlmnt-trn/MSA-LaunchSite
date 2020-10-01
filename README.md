#### Homework notes
there should be more of them - my bad
#### Homework #1
* implementation pretty straight forward
* there shouldn't be tons of dependencies for library mode
#### Homework #2
* I've dound out that module name shouldn't be CamelCase - cos it fails to run ./gradlew bootImageBuild
* forced to rename all modules - >:-[
  affected files are: settings.gradle.kts (import modules)
  and build.gradle.kts 
* funny but you can drop out 
implementation(project(":${library.module.name}")) 
in module/build.gradle.kts - just leave them 
into settings.gradle.kts in main module
* left commented previous line just in case 
I missed something
* after some glitch 'docker image ls' returns funny info about recently generate simple-wallet image:
* **REPOSITORY    | TAG            | IMAGE ID     | CREATED      | SIZE**
* simple-wallet   | 0.0.1-SNAPSHOT | 4ac446ea3000 | 40 years ago | 284MB
* I swear a god I'm just in early 30ty
* command 'docker image inspect docker.io/library/simple-wallet:0.0.1-SNAPSHOT' generates a ton of output
* eval $(minikube docker-env) fails with "shrug" emoji error ...
I've restarted minikube by entering 'minikube restart' and above command worked
* command inside 'exit' after eval $(minikube docker-env) running causes terminal stuck with next output:
'
logout
Saving session...
...saving history...truncating history files...
...completed.

[Process completed] 
'
forced to run new terminal... no idea which process stopped
* installation of dashboard trully wood of wonders - first of all after 
"kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/v2.0.0/aio/deploy/recommended.yaml"
is shows me "The ClusterRoleBinding "kubernetes-dashboard" is invalid: roleRef: Invalid value: rbac.RoleRef{APIGroup:"rbac.authorization.k8s.io", Kind:"ClusterRole", Name:"kubernetes-dashboard"}: cannot change roleRef"
what da hack this meaning - no idea so according to issue in kubernetes github https://github.com/kubernetes/dashboard/issues/4642
i've (notice - not a developer proposed next command =[ ) entered: "kubectl delete clusterrolebinding kubernetes-dashboard" and it helped
* no idea what should be result of homework - which exact yaml - so I've copied each of them
* scaling is possible via terminal - using command 'kubectl scale -n default deployment simple-wallet --replicas=2'