package com.github.panpf.maven.publish

import com.github.panpf.maven.publish.legacy.checkProperties
import com.github.panpf.maven.publish.legacy.configureMavenCentral
import com.github.panpf.maven.publish.legacy.configurePlatform
import com.github.panpf.maven.publish.legacy.configurePom
import com.github.panpf.maven.publish.legacy.configureSigning
import com.github.panpf.maven.publish.legacy.setCoordinates
import org.gradle.api.Plugin
import org.gradle.api.Project

open class MavenPublishPlugin : Plugin<Project> {

  override fun apply(p: Project) {
    p.plugins.apply(MavenPublishBasePlugin::class.java)

    p.extensions.create("mavenPublish", MavenPublishPluginExtension::class.java, p)

    p.setCoordinates()
    p.configurePom()
    p.checkProperties()
    p.configureMavenCentral()
    p.configureSigning()
    p.configurePlatform()
  }
}
