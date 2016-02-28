# sparkarch
A maven archetype for a java spark web project

Clone it

Run "mvn install"

Also run "mvn install archetype:update-local-catalog"

And then create a new spark web project through:

mvn archetype:generate -DarchetypeCatalog=local -DarcheTypeArtifactId=”sparkarch” -DarchetypeVersion="1.0" -DgroupId=yourGroupName -DartifactId=yourArtefactName
