package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final CoroutineLibraryAccessors laccForCoroutineLibraryAccessors = new CoroutineLibraryAccessors(owner);
    private final DatetimeLibraryAccessors laccForDatetimeLibraryAccessors = new DatetimeLibraryAccessors(owner);
    private final DiLibraryAccessors laccForDiLibraryAccessors = new DiLibraryAccessors(owner);
    private final ImageLibraryAccessors laccForImageLibraryAccessors = new ImageLibraryAccessors(owner);
    private final InstrumentedLibraryAccessors laccForInstrumentedLibraryAccessors = new InstrumentedLibraryAccessors(owner);
    private final JetpackLibraryAccessors laccForJetpackLibraryAccessors = new JetpackLibraryAccessors(owner);
    private final KaptLibraryAccessors laccForKaptLibraryAccessors = new KaptLibraryAccessors(owner);
    private final LogLibraryAccessors laccForLogLibraryAccessors = new LogLibraryAccessors(owner);
    private final NetworkLibraryAccessors laccForNetworkLibraryAccessors = new NetworkLibraryAccessors(owner);
    private final SupportLibraryAccessors laccForSupportLibraryAccessors = new SupportLibraryAccessors(owner);
    private final UnitLibraryAccessors laccForUnitLibraryAccessors = new UnitLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

        /**
         * Creates a dependency provider for coroutineService (org.jetbrains.kotlinx:kotlinx-coroutines-play-services)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCoroutineService() { return create("coroutineService"); }

        /**
         * Creates a dependency provider for dependencyUpdatePlugin (com.github.ben-manes:gradle-versions-plugin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDependencyUpdatePlugin() { return create("dependencyUpdatePlugin"); }

        /**
         * Creates a dependency provider for dokkaPlugin (org.jetbrains.dokka:dokka-gradle-plugin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDokkaPlugin() { return create("dokkaPlugin"); }

        /**
         * Creates a dependency provider for firebaseAuth (com.google.firebase:firebase-auth-ktx)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFirebaseAuth() { return create("firebaseAuth"); }

        /**
         * Creates a dependency provider for firebaseCloudStorage (com.google.firebase:firebase-storage-ktx)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFirebaseCloudStorage() { return create("firebaseCloudStorage"); }

        /**
         * Creates a dependency provider for firebaseDynamicLink (com.google.firebase:firebase-dynamic-links-ktx)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFirebaseDynamicLink() { return create("firebaseDynamicLink"); }

        /**
         * Creates a dependency provider for firebaseGoogleSignIn (com.google.android.gms:play-services-auth)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFirebaseGoogleSignIn() { return create("firebaseGoogleSignIn"); }

        /**
         * Creates a dependency provider for firebaseRealTimeDatabase (com.google.firebase:firebase-database-ktx)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFirebaseRealTimeDatabase() { return create("firebaseRealTimeDatabase"); }

        /**
         * Creates a dependency provider for googleServicePlugin (com.google.gms:google-services)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGoogleServicePlugin() { return create("googleServicePlugin"); }

        /**
         * Creates a dependency provider for gradlePlugin (com.android.tools.build:gradle)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGradlePlugin() { return create("gradlePlugin"); }

        /**
         * Creates a dependency provider for hiltPlugin (com.google.dagger:hilt-android-gradle-plugin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHiltPlugin() { return create("hiltPlugin"); }

        /**
         * Creates a dependency provider for jacocoPlugin (org.jacoco:org.jacoco.core)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJacocoPlugin() { return create("jacocoPlugin"); }

        /**
         * Creates a dependency provider for kotlinPlugin (org.jetbrains.kotlin:kotlin-gradle-plugin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKotlinPlugin() { return create("kotlinPlugin"); }

        /**
         * Creates a dependency provider for ktx (androidx.core:core-ktx)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKtx() { return create("ktx"); }

        /**
         * Creates a dependency provider for lottieAnimation (com.airbnb.android:lottie)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLottieAnimation() { return create("lottieAnimation"); }

        /**
         * Creates a dependency provider for navigationPlugin (androidx.navigation:navigation-safe-args-gradle-plugin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getNavigationPlugin() { return create("navigationPlugin"); }

        /**
         * Creates a dependency provider for spotlessPlugin (com.diffplug.spotless:spotless-plugin-gradle)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSpotlessPlugin() { return create("spotlessPlugin"); }

    /**
     * Returns the group of libraries at coroutine
     */
    public CoroutineLibraryAccessors getCoroutine() { return laccForCoroutineLibraryAccessors; }

    /**
     * Returns the group of libraries at datetime
     */
    public DatetimeLibraryAccessors getDatetime() { return laccForDatetimeLibraryAccessors; }

    /**
     * Returns the group of libraries at di
     */
    public DiLibraryAccessors getDi() { return laccForDiLibraryAccessors; }

    /**
     * Returns the group of libraries at image
     */
    public ImageLibraryAccessors getImage() { return laccForImageLibraryAccessors; }

    /**
     * Returns the group of libraries at instrumented
     */
    public InstrumentedLibraryAccessors getInstrumented() { return laccForInstrumentedLibraryAccessors; }

    /**
     * Returns the group of libraries at jetpack
     */
    public JetpackLibraryAccessors getJetpack() { return laccForJetpackLibraryAccessors; }

    /**
     * Returns the group of libraries at kapt
     */
    public KaptLibraryAccessors getKapt() { return laccForKaptLibraryAccessors; }

    /**
     * Returns the group of libraries at log
     */
    public LogLibraryAccessors getLog() { return laccForLogLibraryAccessors; }

    /**
     * Returns the group of libraries at network
     */
    public NetworkLibraryAccessors getNetwork() { return laccForNetworkLibraryAccessors; }

    /**
     * Returns the group of libraries at support
     */
    public SupportLibraryAccessors getSupport() { return laccForSupportLibraryAccessors; }

    /**
     * Returns the group of libraries at unit
     */
    public UnitLibraryAccessors getUnit() { return laccForUnitLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    public static class CoroutineLibraryAccessors extends SubDependencyFactory {

        public CoroutineLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.jetbrains.kotlinx:kotlinx-coroutines-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("coroutine-android"); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("coroutine-core"); }

    }

    public static class DatetimeLibraryAccessors extends SubDependencyFactory {

        public DatetimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for kotlinx (org.jetbrains.kotlinx:kotlinx-datetime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKotlinx() { return create("datetime-kotlinx"); }

    }

    public static class DiLibraryAccessors extends SubDependencyFactory {
        private final DiCompilerLibraryAccessors laccForDiCompilerLibraryAccessors = new DiCompilerLibraryAccessors(owner);

        public DiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for hilt (com.google.dagger:hilt-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHilt() { return create("di-hilt"); }

        /**
         * Returns the group of libraries at di.compiler
         */
        public DiCompilerLibraryAccessors getCompiler() { return laccForDiCompilerLibraryAccessors; }

    }

    public static class DiCompilerLibraryAccessors extends SubDependencyFactory {

        public DiCompilerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for hilt (com.google.dagger:hilt-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHilt() { return create("di-compiler-hilt"); }

    }

    public static class ImageLibraryAccessors extends SubDependencyFactory {
        private final ImageCompilerLibraryAccessors laccForImageCompilerLibraryAccessors = new ImageCompilerLibraryAccessors(owner);

        public ImageLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for glide (com.github.bumptech.glide:glide)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGlide() { return create("image-glide"); }

        /**
         * Returns the group of libraries at image.compiler
         */
        public ImageCompilerLibraryAccessors getCompiler() { return laccForImageCompilerLibraryAccessors; }

    }

    public static class ImageCompilerLibraryAccessors extends SubDependencyFactory {

        public ImageCompilerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for glide (com.github.bumptech.glide:compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGlide() { return create("image-compiler-glide"); }

    }

    public static class InstrumentedLibraryAccessors extends SubDependencyFactory {
        private final InstrumentedCoreLibraryAccessors laccForInstrumentedCoreLibraryAccessors = new InstrumentedCoreLibraryAccessors(owner);
        private final InstrumentedJunitLibraryAccessors laccForInstrumentedJunitLibraryAccessors = new InstrumentedJunitLibraryAccessors(owner);
        private final InstrumentedMockitoLibraryAccessors laccForInstrumentedMockitoLibraryAccessors = new InstrumentedMockitoLibraryAccessors(owner);

        public InstrumentedLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for espresso (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEspresso() { return create("instrumented-espresso"); }

            /**
             * Creates a dependency provider for hilt (com.google.dagger:hilt-android-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHilt() { return create("instrumented-hilt"); }

            /**
             * Creates a dependency provider for navigation (androidx.navigation:navigation-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNavigation() { return create("instrumented-navigation"); }

            /**
             * Creates a dependency provider for room (androidx.room:room-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRoom() { return create("instrumented-room"); }

            /**
             * Creates a dependency provider for truth (com.google.truth:truth)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTruth() { return create("instrumented-truth"); }

            /**
             * Creates a dependency provider for workmanager (androidx.work:work-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getWorkmanager() { return create("instrumented-workmanager"); }

        /**
         * Returns the group of libraries at instrumented.core
         */
        public InstrumentedCoreLibraryAccessors getCore() { return laccForInstrumentedCoreLibraryAccessors; }

        /**
         * Returns the group of libraries at instrumented.junit
         */
        public InstrumentedJunitLibraryAccessors getJunit() { return laccForInstrumentedJunitLibraryAccessors; }

        /**
         * Returns the group of libraries at instrumented.mockito
         */
        public InstrumentedMockitoLibraryAccessors getMockito() { return laccForInstrumentedMockitoLibraryAccessors; }

    }

    public static class InstrumentedCoreLibraryAccessors extends SubDependencyFactory {

        public InstrumentedCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (androidx.arch.core:core-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("instrumented-core-common"); }

            /**
             * Creates a dependency provider for runtime (androidx.arch.core:core-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("instrumented-core-runtime"); }

            /**
             * Creates a dependency provider for testing (androidx.arch.core:core-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTesting() { return create("instrumented-core-testing"); }

    }

    public static class InstrumentedJunitLibraryAccessors extends SubDependencyFactory {

        public InstrumentedJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ext (androidx.test.ext:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExt() { return create("instrumented-junit-ext"); }

    }

    public static class InstrumentedMockitoLibraryAccessors extends SubDependencyFactory {

        public InstrumentedMockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for mockwebserver (com.squareup.okhttp3:mockwebserver)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMockwebserver() { return create("instrumented-mockito-mockwebserver"); }

    }

    public static class JetpackLibraryAccessors extends SubDependencyFactory {
        private final JetpackCompilerLibraryAccessors laccForJetpackCompilerLibraryAccessors = new JetpackCompilerLibraryAccessors(owner);
        private final JetpackKtxLibraryAccessors laccForJetpackKtxLibraryAccessors = new JetpackKtxLibraryAccessors(owner);
        private final JetpackLifecycleLibraryAccessors laccForJetpackLifecycleLibraryAccessors = new JetpackLifecycleLibraryAccessors(owner);
        private final JetpackNavigationLibraryAccessors laccForJetpackNavigationLibraryAccessors = new JetpackNavigationLibraryAccessors(owner);

        public JetpackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for datastore (androidx.datastore:datastore-preferences)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatastore() { return create("jetpack-datastore"); }

            /**
             * Creates a dependency provider for paging (androidx.paging:paging-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPaging() { return create("jetpack-paging"); }

            /**
             * Creates a dependency provider for room (androidx.room:room-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRoom() { return create("jetpack-room"); }

            /**
             * Creates a dependency provider for workmanager (androidx.work:work-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getWorkmanager() { return create("jetpack-workmanager"); }

        /**
         * Returns the group of libraries at jetpack.compiler
         */
        public JetpackCompilerLibraryAccessors getCompiler() { return laccForJetpackCompilerLibraryAccessors; }

        /**
         * Returns the group of libraries at jetpack.ktx
         */
        public JetpackKtxLibraryAccessors getKtx() { return laccForJetpackKtxLibraryAccessors; }

        /**
         * Returns the group of libraries at jetpack.lifecycle
         */
        public JetpackLifecycleLibraryAccessors getLifecycle() { return laccForJetpackLifecycleLibraryAccessors; }

        /**
         * Returns the group of libraries at jetpack.navigation
         */
        public JetpackNavigationLibraryAccessors getNavigation() { return laccForJetpackNavigationLibraryAccessors; }

    }

    public static class JetpackCompilerLibraryAccessors extends SubDependencyFactory {

        public JetpackCompilerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for room (androidx.room:room-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRoom() { return create("jetpack-compiler-room"); }

    }

    public static class JetpackKtxLibraryAccessors extends SubDependencyFactory {

        public JetpackKtxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for room (androidx.room:room-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRoom() { return create("jetpack-ktx-room"); }

    }

    public static class JetpackLifecycleLibraryAccessors extends SubDependencyFactory {

        public JetpackLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-livedata-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("jetpack-lifecycle-ktx"); }

            /**
             * Creates a dependency provider for viewmodel (androidx.lifecycle:lifecycle-viewmodel)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewmodel() { return create("jetpack-lifecycle-viewmodel"); }

    }

    public static class JetpackNavigationLibraryAccessors extends SubDependencyFactory {

        public JetpackNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for fragment (androidx.navigation:navigation-fragment-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFragment() { return create("jetpack-navigation-fragment"); }

            /**
             * Creates a dependency provider for ktx (androidx.navigation:navigation-ui-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("jetpack-navigation-ktx"); }

    }

    public static class KaptLibraryAccessors extends SubDependencyFactory {
        private final KaptInstrumentedLibraryAccessors laccForKaptInstrumentedLibraryAccessors = new KaptInstrumentedLibraryAccessors(owner);

        public KaptLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for hilt (com.google.dagger:hilt-android-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHilt() { return create("kapt-hilt"); }

        /**
         * Returns the group of libraries at kapt.instrumented
         */
        public KaptInstrumentedLibraryAccessors getInstrumented() { return laccForKaptInstrumentedLibraryAccessors; }

    }

    public static class KaptInstrumentedLibraryAccessors extends SubDependencyFactory {

        public KaptInstrumentedLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for hilt (com.google.dagger:hilt-android-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHilt() { return create("kapt-instrumented-hilt"); }

    }

    public static class LogLibraryAccessors extends SubDependencyFactory {

        public LogLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for orhanobut (com.orhanobut:logger)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOrhanobut() { return create("log-orhanobut"); }

            /**
             * Creates a dependency provider for timber (com.jakewharton.timber:timber)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTimber() { return create("log-timber"); }

    }

    public static class NetworkLibraryAccessors extends SubDependencyFactory {

        public NetworkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for converter (com.squareup.retrofit2:converter-gson)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConverter() { return create("network-converter"); }

            /**
             * Creates a dependency provider for gson (com.google.code.gson:gson)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGson() { return create("network-gson"); }

            /**
             * Creates a dependency provider for interceptor (com.squareup.okhttp3:logging-interceptor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInterceptor() { return create("network-interceptor"); }

            /**
             * Creates a dependency provider for okhttp (com.squareup.okhttp3:okhttp)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOkhttp() { return create("network-okhttp"); }

            /**
             * Creates a dependency provider for retrofit (com.squareup.retrofit2:retrofit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRetrofit() { return create("network-retrofit"); }

    }

    public static class SupportLibraryAccessors extends SubDependencyFactory {

        public SupportLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() { return create("support-appcompat"); }

            /**
             * Creates a dependency provider for circleIndicator (me.relex:circleindicator)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCircleIndicator() { return create("support-circleIndicator"); }

            /**
             * Creates a dependency provider for constraint (androidx.constraintlayout:constraintlayout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConstraint() { return create("support-constraint"); }

            /**
             * Creates a dependency provider for material (com.google.android.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() { return create("support-material"); }

            /**
             * Creates a dependency provider for viewpager (androidx.viewpager2:viewpager2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewpager() { return create("support-viewpager"); }

    }

    public static class UnitLibraryAccessors extends SubDependencyFactory {
        private final UnitAndroidxLibraryAccessors laccForUnitAndroidxLibraryAccessors = new UnitAndroidxLibraryAccessors(owner);
        private final UnitCoreLibraryAccessors laccForUnitCoreLibraryAccessors = new UnitCoreLibraryAccessors(owner);
        private final UnitCoroutineLibraryAccessors laccForUnitCoroutineLibraryAccessors = new UnitCoroutineLibraryAccessors(owner);
        private final UnitKotlinLibraryAccessors laccForUnitKotlinLibraryAccessors = new UnitKotlinLibraryAccessors(owner);
        private final UnitOkhttpLibraryAccessors laccForUnitOkhttpLibraryAccessors = new UnitOkhttpLibraryAccessors(owner);

        public UnitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for hilt (com.google.dagger:hilt-android-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHilt() { return create("unit-hilt"); }

            /**
             * Creates a dependency provider for junit (junit:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() { return create("unit-junit"); }

            /**
             * Creates a dependency provider for mockito (org.mockito:mockito-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMockito() { return create("unit-mockito"); }

            /**
             * Creates a dependency provider for truth (com.google.truth:truth)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTruth() { return create("unit-truth"); }

            /**
             * Creates a dependency provider for turbine (app.cash.turbine:turbine)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTurbine() { return create("unit-turbine"); }

        /**
         * Returns the group of libraries at unit.androidx
         */
        public UnitAndroidxLibraryAccessors getAndroidx() { return laccForUnitAndroidxLibraryAccessors; }

        /**
         * Returns the group of libraries at unit.core
         */
        public UnitCoreLibraryAccessors getCore() { return laccForUnitCoreLibraryAccessors; }

        /**
         * Returns the group of libraries at unit.coroutine
         */
        public UnitCoroutineLibraryAccessors getCoroutine() { return laccForUnitCoroutineLibraryAccessors; }

        /**
         * Returns the group of libraries at unit.kotlin
         */
        public UnitKotlinLibraryAccessors getKotlin() { return laccForUnitKotlinLibraryAccessors; }

        /**
         * Returns the group of libraries at unit.okhttp
         */
        public UnitOkhttpLibraryAccessors getOkhttp() { return laccForUnitOkhttpLibraryAccessors; }

    }

    public static class UnitAndroidxLibraryAccessors extends SubDependencyFactory {

        public UnitAndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for test (androidx.test:core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() { return create("unit-androidx-test"); }

    }

    public static class UnitCoreLibraryAccessors extends SubDependencyFactory {

        public UnitCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (androidx.arch.core:core-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("unit-core-common"); }

            /**
             * Creates a dependency provider for runtime (androidx.arch.core:core-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("unit-core-runtime"); }

            /**
             * Creates a dependency provider for testing (androidx.arch.core:core-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTesting() { return create("unit-core-testing"); }

    }

    public static class UnitCoroutineLibraryAccessors extends SubDependencyFactory {

        public UnitCoroutineLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.jetbrains.kotlinx:kotlinx-coroutines-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("unit-coroutine-android"); }

            /**
             * Creates a dependency provider for test (org.jetbrains.kotlinx:kotlinx-coroutines-test)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() { return create("unit-coroutine-test"); }

    }

    public static class UnitKotlinLibraryAccessors extends SubDependencyFactory {

        public UnitKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for mockito (org.mockito.kotlin:mockito-kotlin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMockito() { return create("unit-kotlin-mockito"); }

    }

    public static class UnitOkhttpLibraryAccessors extends SubDependencyFactory {

        public UnitOkhttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for mockwebserver (com.squareup.okhttp3:mockwebserver)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMockwebserver() { return create("unit-okhttp-mockwebserver"); }

    }

    public static class VersionAccessors extends VersionFactory {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: activity (1.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getActivity() { return getVersion("activity"); }

            /**
             * Returns the version associated to this alias: androidx (1.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidx() { return getVersion("androidx"); }

            /**
             * Returns the version associated to this alias: appCompat (1.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppCompat() { return getVersion("appCompat"); }

            /**
             * Returns the version associated to this alias: applicationId (com.app.blingy.reauty)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getApplicationId() { return getVersion("applicationId"); }

            /**
             * Returns the version associated to this alias: auth (21.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAuth() { return getVersion("auth"); }

            /**
             * Returns the version associated to this alias: circleIndicator (2.1.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCircleIndicator() { return getVersion("circleIndicator"); }

            /**
             * Returns the version associated to this alias: cloudStorage (20.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCloudStorage() { return getVersion("cloudStorage"); }

            /**
             * Returns the version associated to this alias: compileSdk (30)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompileSdk() { return getVersion("compileSdk"); }

            /**
             * Returns the version associated to this alias: constraint (2.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getConstraint() { return getVersion("constraint"); }

            /**
             * Returns the version associated to this alias: coreTesting (2.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoreTesting() { return getVersion("coreTesting"); }

            /**
             * Returns the version associated to this alias: coroutine (1.5.2-native-mt)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoroutine() { return getVersion("coroutine"); }

            /**
             * Returns the version associated to this alias: dataStore (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDataStore() { return getVersion("dataStore"); }

            /**
             * Returns the version associated to this alias: dependencyUpdate (0.39.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDependencyUpdate() { return getVersion("dependencyUpdate"); }

            /**
             * Returns the version associated to this alias: dokka (1.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDokka() { return getVersion("dokka"); }

            /**
             * Returns the version associated to this alias: dynamicLink (20.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDynamicLink() { return getVersion("dynamicLink"); }

            /**
             * Returns the version associated to this alias: espresso (3.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getEspresso() { return getVersion("espresso"); }

            /**
             * Returns the version associated to this alias: glide (4.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGlide() { return getVersion("glide"); }

            /**
             * Returns the version associated to this alias: googleService (4.3.8)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGoogleService() { return getVersion("googleService"); }

            /**
             * Returns the version associated to this alias: googleSignIn (19.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGoogleSignIn() { return getVersion("googleSignIn"); }

            /**
             * Returns the version associated to this alias: gradlePlugin (7.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGradlePlugin() { return getVersion("gradlePlugin"); }

            /**
             * Returns the version associated to this alias: gson (2.8.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGson() { return getVersion("gson"); }

            /**
             * Returns the version associated to this alias: hilt (2.38.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getHilt() { return getVersion("hilt"); }

            /**
             * Returns the version associated to this alias: jUnit (4.13.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJUnit() { return getVersion("jUnit"); }

            /**
             * Returns the version associated to this alias: jUnitExt (1.1.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJUnitExt() { return getVersion("jUnitExt"); }

            /**
             * Returns the version associated to this alias: jacoco (0.8.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJacoco() { return getVersion("jacoco"); }

            /**
             * Returns the version associated to this alias: kotlin (1.5.30)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: kotlinxDateTime (0.2.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinxDateTime() { return getVersion("kotlinxDateTime"); }

            /**
             * Returns the version associated to this alias: ktlintPlugin (0.39.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtlintPlugin() { return getVersion("ktlintPlugin"); }

            /**
             * Returns the version associated to this alias: ktx (1.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtx() { return getVersion("ktx"); }

            /**
             * Returns the version associated to this alias: lifeCycle (2.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLifeCycle() { return getVersion("lifeCycle"); }

            /**
             * Returns the version associated to this alias: lottie (4.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLottie() { return getVersion("lottie"); }

            /**
             * Returns the version associated to this alias: material (1.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial() { return getVersion("material"); }

            /**
             * Returns the version associated to this alias: minSdk (23)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMinSdk() { return getVersion("minSdk"); }

            /**
             * Returns the version associated to this alias: mockito (3.11.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMockito() { return getVersion("mockito"); }

            /**
             * Returns the version associated to this alias: mockitoKotlin (3.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMockitoKotlin() { return getVersion("mockitoKotlin"); }

            /**
             * Returns the version associated to this alias: navigation (2.3.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNavigation() { return getVersion("navigation"); }

            /**
             * Returns the version associated to this alias: okHttp (4.9.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkHttp() { return getVersion("okHttp"); }

            /**
             * Returns the version associated to this alias: orhanobut (2.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOrhanobut() { return getVersion("orhanobut"); }

            /**
             * Returns the version associated to this alias: paging (3.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPaging() { return getVersion("paging"); }

            /**
             * Returns the version associated to this alias: realtimeDatabase (20.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRealtimeDatabase() { return getVersion("realtimeDatabase"); }

            /**
             * Returns the version associated to this alias: retrofit (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRetrofit() { return getVersion("retrofit"); }

            /**
             * Returns the version associated to this alias: room (2.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("room"); }

            /**
             * Returns the version associated to this alias: spotlessPlugin (5.14.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSpotlessPlugin() { return getVersion("spotlessPlugin"); }

            /**
             * Returns the version associated to this alias: targetSdk (30)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTargetSdk() { return getVersion("targetSdk"); }

            /**
             * Returns the version associated to this alias: testInstrumentationRunner (androidx.test.runner.AndroidJUnitRunner)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTestInstrumentationRunner() { return getVersion("testInstrumentationRunner"); }

            /**
             * Returns the version associated to this alias: timber (4.7.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTimber() { return getVersion("timber"); }

            /**
             * Returns the version associated to this alias: truth (1.1.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTruth() { return getVersion("truth"); }

            /**
             * Returns the version associated to this alias: turbine (0.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTurbine() { return getVersion("turbine"); }

            /**
             * Returns the version associated to this alias: versionCode (1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersionCode() { return getVersion("versionCode"); }

            /**
             * Returns the version associated to this alias: versionName (1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersionName() { return getVersion("versionName"); }

            /**
             * Returns the version associated to this alias: viewpager (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getViewpager() { return getVersion("viewpager"); }

            /**
             * Returns the version associated to this alias: workManager (2.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getWorkManager() { return getVersion("workManager"); }

    }

    public static class BundleAccessors extends BundleFactory {
        private final CoroutinesBundleAccessors baccForCoroutinesBundleAccessors = new CoroutinesBundleAccessors(providers, config);
        private final DatetimeBundleAccessors baccForDatetimeBundleAccessors = new DatetimeBundleAccessors(providers, config);
        private final DiBundleAccessors baccForDiBundleAccessors = new DiBundleAccessors(providers, config);
        private final FirebaseBundleAccessors baccForFirebaseBundleAccessors = new FirebaseBundleAccessors(providers, config);
        private final ImageBundleAccessors baccForImageBundleAccessors = new ImageBundleAccessors(providers, config);
        private final InstrumentedBundleAccessors baccForInstrumentedBundleAccessors = new InstrumentedBundleAccessors(providers, config);
        private final JetpackBundleAccessors baccForJetpackBundleAccessors = new JetpackBundleAccessors(providers, config);
        private final KaptBundleAccessors baccForKaptBundleAccessors = new KaptBundleAccessors(providers, config);
        private final LogBundleAccessors baccForLogBundleAccessors = new LogBundleAccessors(providers, config);
        private final NetworkBundleAccessors baccForNetworkBundleAccessors = new NetworkBundleAccessors(providers, config);
        private final SupportBundleAccessors baccForSupportBundleAccessors = new SupportBundleAccessors(providers, config);
        private final UnitBundleAccessors baccForUnitBundleAccessors = new UnitBundleAccessors(providers, config);
        private final UtilBundleAccessors baccForUtilBundleAccessors = new UtilBundleAccessors(providers, config);

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at bundles.coroutines
         */
        public CoroutinesBundleAccessors getCoroutines() { return baccForCoroutinesBundleAccessors; }

        /**
         * Returns the group of bundles at bundles.datetime
         */
        public DatetimeBundleAccessors getDatetime() { return baccForDatetimeBundleAccessors; }

        /**
         * Returns the group of bundles at bundles.di
         */
        public DiBundleAccessors getDi() { return baccForDiBundleAccessors; }

        /**
         * Returns the group of bundles at bundles.firebase
         */
        public FirebaseBundleAccessors getFirebase() { return baccForFirebaseBundleAccessors; }

        /**
         * Returns the group of bundles at bundles.image
         */
        public ImageBundleAccessors getImage() { return baccForImageBundleAccessors; }

        /**
         * Returns the group of bundles at bundles.instrumented
         */
        public InstrumentedBundleAccessors getInstrumented() { return baccForInstrumentedBundleAccessors; }

        /**
         * Returns the group of bundles at bundles.jetpack
         */
        public JetpackBundleAccessors getJetpack() { return baccForJetpackBundleAccessors; }

        /**
         * Returns the group of bundles at bundles.kapt
         */
        public KaptBundleAccessors getKapt() { return baccForKaptBundleAccessors; }

        /**
         * Returns the group of bundles at bundles.log
         */
        public LogBundleAccessors getLog() { return baccForLogBundleAccessors; }

        /**
         * Returns the group of bundles at bundles.network
         */
        public NetworkBundleAccessors getNetwork() { return baccForNetworkBundleAccessors; }

        /**
         * Returns the group of bundles at bundles.support
         */
        public SupportBundleAccessors getSupport() { return baccForSupportBundleAccessors; }

        /**
         * Returns the group of bundles at bundles.unit
         */
        public UnitBundleAccessors getUnit() { return baccForUnitBundleAccessors; }

        /**
         * Returns the group of bundles at bundles.util
         */
        public UtilBundleAccessors getUtil() { return baccForUtilBundleAccessors; }

    }

    public static class CoroutinesBundleAccessors extends BundleFactory {

        public CoroutinesBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for coroutines-bundles which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.jetbrains.kotlinx:kotlinx-coroutines-android</li>
             *    <li>org.jetbrains.kotlinx:kotlinx-coroutines-core</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBundles() { return createBundle("coroutines-bundles"); }

    }

    public static class DatetimeBundleAccessors extends BundleFactory {

        public DatetimeBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for datetime-bundles which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.jetbrains.kotlinx:kotlinx-datetime</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBundles() { return createBundle("datetime-bundles"); }

    }

    public static class DiBundleAccessors extends BundleFactory {

        public DiBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for di-bundles which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.google.dagger:hilt-android</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBundles() { return createBundle("di-bundles"); }

    }

    public static class FirebaseBundleAccessors extends BundleFactory {

        public FirebaseBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for firebase-bundles which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.google.firebase:firebase-auth-ktx</li>
             *    <li>com.google.firebase:firebase-database-ktx</li>
             *    <li>com.google.firebase:firebase-storage-ktx</li>
             *    <li>org.jetbrains.kotlinx:kotlinx-coroutines-play-services</li>
             *    <li>com.google.android.gms:play-services-auth</li>
             *    <li>com.google.firebase:firebase-dynamic-links-ktx</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBundles() { return createBundle("firebase-bundles"); }

    }

    public static class ImageBundleAccessors extends BundleFactory {

        public ImageBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for image-bundles which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.github.bumptech.glide:glide</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBundles() { return createBundle("image-bundles"); }

    }

    public static class InstrumentedBundleAccessors extends BundleFactory {
        private final InstrumentedTestingBundleAccessors baccForInstrumentedTestingBundleAccessors = new InstrumentedTestingBundleAccessors(providers, config);

        public InstrumentedBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at bundles.instrumented.testing
         */
        public InstrumentedTestingBundleAccessors getTesting() { return baccForInstrumentedTestingBundleAccessors; }

    }

    public static class InstrumentedTestingBundleAccessors extends BundleFactory {

        public InstrumentedTestingBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for instrumented-testing-bundles which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.test.ext:junit</li>
             *    <li>androidx.test.espresso:espresso-core</li>
             *    <li>com.google.truth:truth</li>
             *    <li>com.google.dagger:hilt-android-testing</li>
             *    <li>androidx.room:room-testing</li>
             *    <li>androidx.work:work-testing</li>
             *    <li>androidx.navigation:navigation-testing</li>
             *    <li>com.squareup.okhttp3:mockwebserver</li>
             *    <li>androidx.arch.core:core-testing</li>
             *    <li>androidx.arch.core:core-common</li>
             *    <li>androidx.arch.core:core-runtime</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBundles() { return createBundle("instrumented-testing-bundles"); }

    }

    public static class JetpackBundleAccessors extends BundleFactory {

        public JetpackBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for jetpack-bundles which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.lifecycle:lifecycle-viewmodel</li>
             *    <li>androidx.lifecycle:lifecycle-livedata-ktx</li>
             *    <li>androidx.navigation:navigation-fragment-ktx</li>
             *    <li>androidx.navigation:navigation-ui-ktx</li>
             *    <li>androidx.room:room-runtime</li>
             *    <li>androidx.room:room-ktx</li>
             *    <li>androidx.datastore:datastore-preferences</li>
             *    <li>androidx.paging:paging-runtime-ktx</li>
             *    <li>androidx.work:work-runtime-ktx</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBundles() { return createBundle("jetpack-bundles"); }

    }

    public static class KaptBundleAccessors extends BundleFactory {

        public KaptBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for kapt-bundles which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.room:room-compiler</li>
             *    <li>com.google.dagger:hilt-compiler</li>
             *    <li>com.github.bumptech.glide:compiler</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBundles() { return createBundle("kapt-bundles"); }

    }

    public static class LogBundleAccessors extends BundleFactory {

        public LogBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for log-bundles which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.jakewharton.timber:timber</li>
             *    <li>com.orhanobut:logger</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBundles() { return createBundle("log-bundles"); }

    }

    public static class NetworkBundleAccessors extends BundleFactory {

        public NetworkBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for network-bundles which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.squareup.retrofit2:retrofit</li>
             *    <li>com.squareup.okhttp3:logging-interceptor</li>
             *    <li>com.squareup.retrofit2:converter-gson</li>
             *    <li>com.google.code.gson:gson</li>
             *    <li>com.squareup.okhttp3:okhttp</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBundles() { return createBundle("network-bundles"); }

    }

    public static class SupportBundleAccessors extends BundleFactory {

        public SupportBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for support-bundles which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.core:core-ktx</li>
             *    <li>androidx.appcompat:appcompat</li>
             *    <li>com.google.android.material:material</li>
             *    <li>androidx.constraintlayout:constraintlayout</li>
             *    <li>androidx.viewpager2:viewpager2</li>
             *    <li>me.relex:circleindicator</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBundles() { return createBundle("support-bundles"); }

    }

    public static class UnitBundleAccessors extends BundleFactory {
        private final UnitTestingBundleAccessors baccForUnitTestingBundleAccessors = new UnitTestingBundleAccessors(providers, config);

        public UnitBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at bundles.unit.testing
         */
        public UnitTestingBundleAccessors getTesting() { return baccForUnitTestingBundleAccessors; }

    }

    public static class UnitTestingBundleAccessors extends BundleFactory {

        public UnitTestingBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for unit-testing-bundles which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.jetbrains.kotlinx:kotlinx-coroutines-android</li>
             *    <li>org.jetbrains.kotlinx:kotlinx-coroutines-test</li>
             *    <li>com.squareup.okhttp3:mockwebserver</li>
             *    <li>junit:junit</li>
             *    <li>androidx.test:core</li>
             *    <li>com.google.truth:truth</li>
             *    <li>app.cash.turbine:turbine</li>
             *    <li>org.mockito:mockito-core</li>
             *    <li>org.mockito.kotlin:mockito-kotlin</li>
             *    <li>com.google.dagger:hilt-android-testing</li>
             *    <li>androidx.arch.core:core-testing</li>
             *    <li>androidx.arch.core:core-common</li>
             *    <li>androidx.arch.core:core-runtime</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBundles() { return createBundle("unit-testing-bundles"); }

    }

    public static class UtilBundleAccessors extends BundleFactory {

        public UtilBundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for util-bundles which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.airbnb.android:lottie</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getBundles() { return createBundle("util-bundles"); }

    }

}
