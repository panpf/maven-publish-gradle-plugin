# Change Log

Version 0.18.0
---------------------------------

- The minimum supported Kotlin version is now `1.4.30`
- It's now possible to specify `SONATYPE_HOST` as a Gradle property, e.g.
    - `SONATYPE_HOST=S01` for `s01.sonatype.org`
    - `SONATYPE_HOST=` to not add any repository by default
- Fixed an issue when publishing Kotlin MPP projects with the base plugin
- Removed checks for presence of properties that aren't used by this plugin anymore


Version 0.17.0
---------------------------------

- Removed the deprecated `uploadArchives` and `installArchives` tasks. Use `publish` and `publishToMavenLocal` instead.


Version 0.16.0
---------------------------------

- Add `pomFromGradleProperties` API to base plugin. This configures the pom in the same way the regular plugin does.
- Add the ability to remove the default `mavenCentral` repository, by setting `sonatypeHost` to `null`
- Support `POM_LICENSE_NAME`, `POM_LICENSE_URL` and `POM_LICENSE_DIST` properties in addition to `LICENCE` based properties.
- Fixes an issue in the base plugin that caused an error during configuration of Android projects.
- Fixes an issue with javadoc tasks when using Java toolchains.
- The deprecated `nexusOptions` and `nexus {}` methods were removed. `closeAndReleaseRepository` is automatically configured.

## v0.16.0-beta01
* Copy from `https://github.com/vanniktech/gradle-maven-publish-plugin` `0.16.0 (development) 4b3df71` version
* Add `disableAndroidJavaDocsAddReferencesLinks` configuration option to MavenPublishPluginExtension