#!groovy
@groovy.transform.BaseScript com.ibm.dbb.groovy.ScriptLoader baseScript
import com.ibm.dbb.build.*
import com.ibm.dbb.repository.*
import com.ibm.dbb.dependency.*
import java.nio.file.*
import groovy.time.*
println "starting checkout"
["git", "checkout", "master"].execute()

