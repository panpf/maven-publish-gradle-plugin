# Change Log

Version 0.16.0 *(In development)*
---------------------------------

- Add `pomFromGradleProperties` API to base plugin. This configures the pom in the same way the regular plugin does.
- Add the ability to remove the default `mavenCentral` repository, by setting `sonatypeHost` to `null`
- Support `POM_LICENSE_NAME`, `POM_LICENSE_URL` and `POM_LICENSE_DIST` properties in addition to `LICENCE` based properties.
- Fixes an issue in the base plugin that caused an error during configuration of Android projects.
- Fixes an issue with javadoc tasks when using Java toolchains.
- The deprecated `nexusOptions` method was removed. `closeAndReleaseRepository` is automatically configured.

## v0.16.0-beta01
* Copy from `https://github.com/vanniktech/gradle-maven-publish-plugin` `0.16.0 (development) 4b3df71` version
* MavenPublishPluginExtension adds `disableAndroidJavaDocsAddReferencesLinks` configuration option