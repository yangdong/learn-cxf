import org.gradle.api.Plugin
import org.gradle.api.Project

class LineCounterPlugin implements Plugin<Project> {
	def	void apply(Project project) {
		def sourceFileConfig = new LineCounterPluginConvention()
		project.task('checkLines') << {
			println "checking the line of source code for $sourceFileConfig.sourceFile"
		}
	}
}

class LineCounterPluginConvention {
	def sourceFile = 'src/main/java'
}